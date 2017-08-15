package org.tac.ms.cloud.tacmscloudzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@EnableHystrix
@SpringBootApplication
public class TacMsCloudZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacMsCloudZuulApplication.class, args);
	}
}
