package com.social.graph.tao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.config.EnableNeo4jAuditing;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableNeo4jAuditing
public class TaoApplication {

	 @GetMapping("/")
	 public String hello() {
		 return "TAO service is running";
	 }

	public static void main(String[] args) {
		SpringApplication.run(TaoApplication.class, args);
	}
}
