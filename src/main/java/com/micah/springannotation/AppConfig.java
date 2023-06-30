package com.micah.springannotation;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.micah.springannotation")
public class AppConfig {
	/*
	 * @Bean public Samsung getPhone() { return new Samsung(); }
	 * 
	 * @Bean public Tecno getPhone1() { return new Tecno(); }
	 */
}
