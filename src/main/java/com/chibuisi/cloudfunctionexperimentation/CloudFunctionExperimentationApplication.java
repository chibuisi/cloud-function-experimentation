package com.chibuisi.cloudfunctionexperimentation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class CloudFunctionExperimentationApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudFunctionExperimentationApplication.class, args);
    }

    @Bean
    public Function<String,String> function(){
        return input -> input.toUpperCase();
    }

    @Bean
    public Consumer<String> consume(){
        return input -> System.out.println("input: "+ input);
    }

    @Bean
    public Supplier<String> supply(){
        return () -> new String("A copy of a json string");
    }

}
