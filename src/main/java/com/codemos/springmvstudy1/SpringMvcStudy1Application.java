package com.codemos.springmvstudy1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class SpringMvcStudy1Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringMvcStudy1Application.class, args);
	}
}
