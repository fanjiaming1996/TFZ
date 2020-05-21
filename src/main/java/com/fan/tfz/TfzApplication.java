package com.fan.tfz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class TfzApplication {

    public static void main(String[] args) {
        SpringApplication.run(TfzApplication.class, args);
    }

}
