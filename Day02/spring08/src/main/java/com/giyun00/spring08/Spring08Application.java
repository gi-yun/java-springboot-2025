package com.giyun00.spring08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring08Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring08Application.class, args);

		//상속
		Dog ppoppy =  new Dog();
		ppoppy.setName("뽀삐");
		ppoppy.cry1();

		Cat kitty = new Cat();
		kitty.setName("키티");
		kitty.cry1();
	}

}
