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
            System.out.println(myProps.getFoo().getFooProp1());
            System.out.println(myProps.getBarList().get(0).getBar());
            System.out.println(myProps.getLibPojo1().getLibProp1());
            System.out.println(myProps.getInnerfoo().getBuzz());
            System.out.println(myProps.getNonStaticInnerFoo()); // will return null
            // will fail:
            //System.out.println(myProps.getNonStaticInnerFoo().getBuzz());
            System.out.println("--------------------------------------");
        };
    }
}
