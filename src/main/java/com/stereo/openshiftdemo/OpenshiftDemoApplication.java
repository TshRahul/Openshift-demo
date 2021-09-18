package com.stereo.openshiftdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshiftDemoApplication {

	@GetMapping("/")
	public String hello(){
		return "Hello World!!";
	}

	@GetMapping("/{input}")
	public String welcome(@PathVariable String input){
		return input;
	}

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftDemoApplication.class, args);
	}

}
