package fi.vm.sade.eperusteet.utils.audit.config;

import fi.vm.sade.auditlog.ApplicationType;
import fi.vm.sade.auditlog.Audit;
import fi.vm.sade.eperusteet.utils.audit.AuditLogger;
import fi.vm.sade.eperusteet.utils.audit.CommonAuditer;
import fi.vm.sade.eperusteet.utils.revision.RevisionMetaService;
import fi.vm.sade.eperusteet.utils.revision.impl.RevisionMetaServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuditUtilConfiguration {

    @Bean
    public CommonAuditer commonAuditer() {
        return new CommonAuditer();
    }

    @Bean
    public AuditLogger auditLogger() {
        return new AuditLogger();
    }

    @Bean
    public RevisionMetaService revisionMetaService() {
        return new RevisionMetaServiceImpl();
    }

}
