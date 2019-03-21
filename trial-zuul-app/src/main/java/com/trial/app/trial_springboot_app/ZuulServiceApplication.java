package com.trial.app.trial_springboot_app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulServiceApplication extends SpringBootServletInitializer
{
	public static void main(String[] args) {
		new ZuulServiceApplication()
			.configure(new SpringApplicationBuilder(ZuulServiceApplication.class)).run(args);

	}
}
