package com.trial.app.trial_springboot_app;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableEurekaClient
public class SpringBootStarterApp extends SpringBootServletInitializer
{
	public static void main(String[] args) {
		new SpringBootStarterApp()
			.configure(new SpringApplicationBuilder(SpringBootStarterApp.class)).run(args);

	}
}
