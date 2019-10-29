package com.wlg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//以下注解可省略
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProvider8003_APP {

	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8003_APP.class, args);
	}
}
