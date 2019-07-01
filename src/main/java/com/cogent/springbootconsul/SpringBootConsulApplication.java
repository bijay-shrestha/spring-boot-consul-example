package com.cogent.springbootconsul;

import com.cogent.springbootconsul.config.F1soft;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = F1soft.class)
public class SpringBootConsulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsulApplication.class, args);
    }

}
