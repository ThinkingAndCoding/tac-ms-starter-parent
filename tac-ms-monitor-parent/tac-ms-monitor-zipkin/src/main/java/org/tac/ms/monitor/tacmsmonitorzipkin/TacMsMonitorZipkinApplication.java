package org.tac.ms.monitor.tacmsmonitorzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@SpringBootApplication
@EnableZipkinStreamServer
public class TacMsMonitorZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacMsMonitorZipkinApplication.class, args);
	}
}
