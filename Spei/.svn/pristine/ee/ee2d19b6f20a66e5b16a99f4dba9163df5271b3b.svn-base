package com.cms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cms.core.BasePathExposer;


@MapperScan("com.cms.mapper")
@SpringBootApplication
public class PeiappApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeiappApplication.class, args);
	}
	
	@Bean(initMethod=("init"))
	public BasePathExposer getBasePathExposer() {
		return new BasePathExposer();
	}
}
