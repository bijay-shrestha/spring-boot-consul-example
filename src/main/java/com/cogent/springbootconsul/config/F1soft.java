package com.cogent.springbootconsul.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;

@ConfigurationProperties(prefix = "f1")
@PropertySource("classpath:f1soft.yml")
@Data
public class F1soft {
    private String username;
    private String password;
    private String email;
    private String address;

}
