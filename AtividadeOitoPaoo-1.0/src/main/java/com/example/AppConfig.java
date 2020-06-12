package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.util.Calculadora;

@Configuration
public class AppConfig {
	
	@Bean
	public Calculadora getCalculadora() {
		return new Calculadora();
	}
}

