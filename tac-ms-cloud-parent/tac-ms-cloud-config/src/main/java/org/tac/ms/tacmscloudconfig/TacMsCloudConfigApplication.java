package org.tac.ms.tacmscloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TacMsCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacMsCloudConfigApplication.class, args);
	}
}
