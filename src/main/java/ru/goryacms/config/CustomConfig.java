package ru.goryacms.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.util.concurrent.Executors;

@Configuration
public class CustomConfig {
//    @Value("${spring.datasource.maximum-pool-size}")
//    private int connectionPoolSize;

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

//    @Bean
//    public Scheduler jdbcScheduler() {
//        return Schedulers.fromExecutor(Executors.newFixedThreadPool(connectionPoolSize));
//    }
//
//    @Bean
//    public TransactionTemplate transactionTemplate(PlatformTransactionManager transactionManager) {
//        return new TransactionTemplate(transactionManager);
//    }
}
