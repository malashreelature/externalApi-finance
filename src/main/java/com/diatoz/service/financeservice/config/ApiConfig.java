package com.diatoz.service.financeservice.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
    public class ApiConfig {


        @Bean
        public RestTemplate restTesmplate() {
            return new RestTemplate();
        }

    }

