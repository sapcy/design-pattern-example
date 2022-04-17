package com.example.designPattern;

import com.example.designPattern.decorator.Coffee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.zip.ZipInputStream;

@SpringBootApplication
public class DesignPatternExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternExampleApplication.class, args);

		Coffee coffee = new Coffee();
		coffee.print();
	}
}
