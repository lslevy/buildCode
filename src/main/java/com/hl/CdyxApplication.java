package com.hl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hl.dao")
public class CdyxApplication {

	public static void main(String[] args) {
		SpringApplication.run(CdyxApplication.class, args);
	}
}
