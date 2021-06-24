package com.sanowar.taskApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.sanowar.taskApi"})
public class TodoApp extends SpringBootServletInitializer {

	public static void main(String[] args) {
		System.out.println( "Task Management Service App Start Running...!" );
		SpringApplication.run(TodoApp.class, args);
		System.out.println( "Task Management Service App Running Successfully...!" );
	}

}
