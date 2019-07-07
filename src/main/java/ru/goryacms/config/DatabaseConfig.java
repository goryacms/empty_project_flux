package ru.goryacms.config;

import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionFactory;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.function.DatabaseClient;
import org.springframework.data.r2dbc.repository.support.R2dbcRepositoryFactory;
import org.springframework.data.relational.core.mapping.RelationalMappingContext;

@Configuration
public class DatabaseConfig {
    @Bean
    PostgresqlConnectionFactory connectionFactory() {
        return new PostgresqlConnectionFactory(
                PostgresqlConnectionConfiguration.builder()
                .host("192.168.99.100")
                .database("webflux")
                .username("postgres")
                .password("goryacms")
                .build();
        );
    }

    @Bean
    DatabaseClient databaseClient(ConnectionFactory connectionFactory){
        return DatabaseClient.builder()
                .connectionFactory(connectionFactory)
                .build();
    }

    @Bean
    R2dbcRepositoryFactory repositoryFactory(DatabaseClient client){
        RelationalMappingContext context = new RelationalMappingContext();
        context.afterPropertiesSet();
        return new R2dbcRepositoryFactory(client, context);
    }

    // TODO: after inserting MVC-layouts
//    @Bean
//    MyRepository myRepository(R2dbcRepositoryFactory factory){
//        return factory.getRepository(MyRepository.class);
//    }

}