package com.purbita.JACOCODemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JacocoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JacocoDemoApplication.class, args);
		
		System.out.println("start");
		start();
	}
	
	public static String start()
	{
		return "start";
	}
	
	public static String stop()
	{
		return "stop";
	}
}
