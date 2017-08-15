package org.tac.ms.tacmsrobotlogic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@EnableHystrix
@FeignClient
@SpringBootApplication
@ComponentScan(basePackages = {"org.tac.ms"})
@MapperScan(basePackages = "org.tac.ms.tacmsrobotlogic.dao")
public class TacMsRobotLogicApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacMsRobotLogicApplication.class, args);
	}
}
