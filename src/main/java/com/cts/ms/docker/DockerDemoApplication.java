package com.cts.ms.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerDemoApplication {
	@GetMapping("/docker-demo")
	public String hello() {
		return "Welcome to docker !";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
	}

}
