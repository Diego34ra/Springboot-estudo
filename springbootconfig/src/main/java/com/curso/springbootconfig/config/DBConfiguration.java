package com.curso.springbootconfig.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("spring.datasource")

public class DBConfiguration {


    private String driverClassName;
    private String url;
    private String username;
    private String password;

    public String testeDataBaseConnection(){
        System.out.println("DB connection for DEV - H2");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to H2_TEST - Teste instance";
    }

}
