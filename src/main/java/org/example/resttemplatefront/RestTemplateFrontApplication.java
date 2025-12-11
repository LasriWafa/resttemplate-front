package org.example.resttemplatefront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateFrontApplication extends SpringBootServletInitializer {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        // must reference *this* class
        return application.sources(RestTemplateFrontApplication.class);
    }

    public static void main(String[] args) {
        // must reference *this* class
        SpringApplication.run(RestTemplateFrontApplication.class, args);
        System.out.println("Application démarrée");
    }
}
