package com.example.hackathonbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HackathonBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(HackathonBackendApplication.class, args);
    }

}
