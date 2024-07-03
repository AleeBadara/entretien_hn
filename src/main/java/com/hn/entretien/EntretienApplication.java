package com.hn.entretien;

import com.hn.entretien.Task.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class EntretienApplication {
    private static final Logger log = LoggerFactory.getLogger(EntretienApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EntretienApplication.class, args);
        log.info("EntretienApplication sucessfully started!");
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            Task task = new Task("1", "Courir", LocalDateTime.now(), LocalDateTime.now().plusHours(1));
            log.info("Task {}: ", task);
        };
    }

}
