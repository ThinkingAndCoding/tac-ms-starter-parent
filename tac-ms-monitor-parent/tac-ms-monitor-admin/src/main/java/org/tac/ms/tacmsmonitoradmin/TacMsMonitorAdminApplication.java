package org.tac.ms.tacmsmonitoradmin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableAutoConfiguration
@EnableAdminServer
@EnableDiscoveryClient
public class TacMsMonitorAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacMsMonitorAdminApplication.class, args);
	}
}
