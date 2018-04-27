package com.dsplat;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaStarter {

		public static void main(String[] args) {
			new SpringApplicationBuilder(EurekaStarter.class).web(true).run(args);
		}

}
