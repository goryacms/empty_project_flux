package ru.goryacms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
//@EnableJpaRepositories
public class SpringWebFluxForPracticeApplication {
  public static void main(String[] args) {
    SpringApplication.run(SpringWebFluxForPracticeApplication.class, args);

//    EmptyWebClient webClient = new EmptyEmployeeWebClient();
//    webClient.consume();
  }
}