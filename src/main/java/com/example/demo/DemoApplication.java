package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
@Bean
    public CommandLineRunner commandLineRunner(MyProps myProps) {
        return args -> {
            System.out.println("--------------------------------------");
			System.out.println(myProps.getFoo().getBar());
			System.out.println(myProps.getFoolist().get(0).getBar());
			System.out.println(myProps.getInnerfoo().getBuzz());
			System.out.println("--------------------------------------");
        };
    }
}
