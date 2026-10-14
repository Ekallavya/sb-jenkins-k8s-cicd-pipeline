package com.universe;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Slf4j
@RestController
public class SbJenkinsK8sCicdPipelineApplication {

    public static void main(String[] args) {
        log.info("Starting Spring Boot Application");

        SpringApplication.run(SbJenkinsK8sCicdPipelineApplication.class, args);
    }

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        log.info("Health check endpoint called");
        return ResponseEntity.status(HttpStatus.OK).body("Hello User,SbJenkinsK8sCicdPipelineApplication is running");
    }
}
