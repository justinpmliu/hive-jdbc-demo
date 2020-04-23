package com.example.hivedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.hivedemo.mapper")
@SpringBootApplication
public class HiveDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiveDemoApplication.class, args);
	}

}
