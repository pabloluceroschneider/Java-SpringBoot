package com.example.javaapicoalq;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

public class HolaMundo {

    public static void main(String[] args) {

        SpringApplication.run(HolaMundo.class, args);
    }

    @Bean
    public String saluda(){
        System.out.println("Hola mundo...");
        return "";
    }

}
