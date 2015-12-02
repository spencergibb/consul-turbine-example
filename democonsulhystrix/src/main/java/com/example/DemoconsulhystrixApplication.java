package com.example;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableHystrix
@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class DemoconsulhystrixApplication {

	@RequestMapping("/")
	@HystrixCommand
	public String hi() {
		return "Hello";
	}

    public static void main(String[] args) {
        SpringApplication.run(DemoconsulhystrixApplication.class, args);
    }
}
