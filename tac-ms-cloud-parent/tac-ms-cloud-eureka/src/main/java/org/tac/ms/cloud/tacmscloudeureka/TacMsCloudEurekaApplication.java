package org.tac.ms.cloud.tacmscloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TacMsCloudEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacMsCloudEurekaApplication.class, args);
	}
}
