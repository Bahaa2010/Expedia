package org.sdt.expedia.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
@EnableAutoConfiguration
@ComponentScan({ "org.sdt" })
public class ExpediaTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpediaTaskApplication.class, args);
	}
}
