package com.example.hivedemo;

import com.example.hivedemo.config.HiveDruidConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(HiveDruidConfiguration.class)
public class HiveDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiveDemoApplication.class, args);
	}

}
