package com.example.hivedemo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "hive")
@Setter
@Getter
public class HiveProperties {
    private String url;
    private String user;
    private String password;
    private String driverClassName;
}
