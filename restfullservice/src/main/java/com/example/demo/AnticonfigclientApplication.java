package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class AnticonfigclientApplication {

	@Autowired
	Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(AnticonfigclientApplication.class, args);
	}

	@GetMapping("/api/hello")
	public ResponseEntity<String> getHello() {
		return ResponseEntity.ok("Anti Hello " + environment.getProperty("local.server.port"));
	}

	@GetMapping("/")
	public ResponseEntity<String> getServerStatus() {
		return ResponseEntity.ok("Everything is ok");
	}
}
