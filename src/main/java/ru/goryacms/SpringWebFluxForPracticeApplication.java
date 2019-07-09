package ru.goryacms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
@EnableJdbcRepositories
public class SpringWebFluxForPracticeApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringWebFluxForPracticeApplication.class, args);

//    EmptyWebClient webClient = new EmptyEmployeeWebClient();
//    webClient.consume();
    }
}