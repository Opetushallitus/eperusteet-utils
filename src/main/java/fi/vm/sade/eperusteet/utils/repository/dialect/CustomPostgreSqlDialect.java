package fi.vm.sade.eperusteet.utils.repository.dialect;

import org.hibernate.dialect.PostgreSQLDialect;

import java.sql.Types;


public class CustomPostgreSqlDialect extends PostgreSQLDialect {
    public CustomPostgreSqlDialect() {
        super();
//        registerColumnType(Types.JAVA_OBJECT, "jsonb");
    }
}
