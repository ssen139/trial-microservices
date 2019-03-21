package com.trial.app.trial_springboot_app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class EurekaServiceApplication extends SpringBootServletInitializer
{
	public static void main(String[] args) {
		new EurekaServiceApplication()
			.configure(new SpringApplicationBuilder(EurekaServiceApplication.class)).run(args);

	}
}
