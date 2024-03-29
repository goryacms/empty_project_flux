package ru.goryacms.config;

import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionFactory;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.function.DatabaseClient;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.data.r2dbc.repository.support.R2dbcRepositoryFactory;
import org.springframework.data.relational.core.mapping.RelationalMappingContext;
import ru.goryacms.office.repository.OfficeRepository;
import ru.goryacms.user.repository.UserRepository;

@Configuration
@EnableR2dbcRepositories
public class DatabaseConfig /*extends AbstractR2dbcConfiguration*/ {
    @Bean
    public ConnectionFactory connectionFactory() {
        return new PostgresqlConnectionFactory(
                PostgresqlConnectionConfiguration.builder()
                        .host("192.168.99.100")
                        .port(5432)
                        .schema("public")
                        .database("webflux")
                        .username("postgres")
                        .password("goryacms")
                        .build()
        );
    }

    @Bean
    DatabaseClient databaseClient() {
        return DatabaseClient.builder()
                .connectionFactory(this.connectionFactory())
                .build();
    }

    @Bean
    R2dbcRepositoryFactory repositoryFactory(DatabaseClient client) {
        RelationalMappingContext context = new RelationalMappingContext();
        context.afterPropertiesSet();
        return new R2dbcRepositoryFactory(client, context);
    }

    @Bean
    UserRepository userRepository(R2dbcRepositoryFactory factory) {
        return factory.getRepository(UserRepository.class);
    }

    @Bean
    OfficeRepository officeRepository(R2dbcRepositoryFactory factory) {
        return factory.getRepository(OfficeRepository.class);
    }

}

