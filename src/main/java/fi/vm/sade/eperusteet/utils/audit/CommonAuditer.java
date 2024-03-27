package fi.vm.sade.eperusteet.utils.audit;

import fi.vm.sade.auditlog.Audit;
import fi.vm.sade.auditlog.Changes;
import fi.vm.sade.auditlog.Target;
import fi.vm.sade.auditlog.User;
import fi.vm.sade.javautils.http.HttpServletRequestUtils;
import java.net.InetAddress;
import java.security.Principal;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.collections.MapUtils;
import org.ietf.jgss.GSSException;
import org.ietf.jgss.Oid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Component
public class CommonAuditer {

    @Autowired(required = false)
    public Audit audit;

    private static final Logger LOG = LoggerFactory.getLogger(CommonAuditer.class);

    public void log(String methodName, String className, Changes changes, Target target) throws GSSException {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        audit.log(
                getUser(request),
                () -> methodName,
                new Target.Builder().setField("className", className).build(),
                changes
        );
    }

    public void log(String methodName, String className, Changes changes) throws GSSException {
        log(methodName, className, changes, Collections.emptyMap());
    }

    public void log(String methodName, String className, Changes changes, Map<String, Object> params) throws GSSException {
        Target.Builder target = new Target.Builder().setField("className", className);

        if (!MapUtils.isEmpty(params)) {
            params.entrySet().stream()
                    .collect(Collectors.toMap(
                            e -> e.getKey(),
                            e -> e.toString())
                    ).forEach(target::setField);
        }

        log(methodName, className, changes, target.build());
    }

    public User getUser(HttpServletRequest request) {
        String userOid = loggedInUserOid();
        String userAgent = getUserAgentHeader(request);
        String session = getSession(request);
        InetAddress ip = getInetAddress(request);
        return getUser(userOid, ip, session, userAgent);
    }

    public String loggedInUserOid() {
        SecurityContext context = SecurityContextHolder.getContext();
        Assert.notNull(context, "Null SecurityContext! Make sure to only call this method from request thread.");
        Principal p = context.getAuthentication();
        Assert.notNull(p, "Null principal! Something wrong in the authentication?");
        return p.getName();
    }

    private String getUserAgentHeader(HttpServletRequest request) {
        return request.getHeader("User-Agent");
    }

    private String getSession(HttpServletRequest request) {
        try {
            return request.getSession(false).getId();
        } catch(Exception e) {
            LOG.error("Couldn't log session for request {}", request);
            return null;
        }
    }

    private InetAddress getInetAddress(HttpServletRequest request) {
        try {
            return InetAddress.getByName(HttpServletRequestUtils.getRemoteAddress(request));
        } catch(Exception e) {
            LOG.error("Couldn't log InetAddress for log entry", e);
            return null;
        }
    }

    private User getUser(String userOid, InetAddress ip, String session, String userAgent) {
        try {
            return new User(new Oid(userOid), ip, session, userAgent);
        } catch (GSSException e) {
            return new User(null, ip, session, userAgent);
        }
    }

    public String username() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return auth != null
                ? auth.getName()
                : "Tuntematon käyttäjä";
    }
}
