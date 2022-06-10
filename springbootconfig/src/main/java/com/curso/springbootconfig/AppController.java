package com.curso.springbootconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.message}")
    private String appMessage;

    @Value("${ENV_DB_URL:jdbc:h2:mem:db}")
    private String dbVariavelAmbiemte;

    @GetMapping("/")
    public String getAppMessage() {
        return appMessage;
    }

    @GetMapping("/VariavelAmb")
    public String getDbVariavelAmbiemte() {
        return "A seguinte variável de ambiente foi passada" + dbVariavelAmbiemte;
    }
}
