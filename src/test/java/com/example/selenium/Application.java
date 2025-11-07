package com.example.selenium;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Application {

    @Value("${selenium.browser}")
    private String browser;

    @Value("${target.application.baseUrl}")
    private String baseUrl;

    @Value("${spring.config.name:application}")
    private String configFile;

    @PostConstruct
    public void printEnvironmentDetails() {
        System.out.println("Environment loaded from: " + configFile + ".properties");
        System.out.println("Browser: " + browser);
        System.out.println("Base URL: " + baseUrl);
        System.out.println("--------");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
