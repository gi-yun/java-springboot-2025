package com.giyun00.spring07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring07Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring07Application.class, args);


		// 클래스 사용
		NewCar peugeot = new NewCar("206cc", "peugeot", 2016);

		NewCar avante = new NewCar();
		avante.company = "현대자동차";
		avante.color = "blue";
		avante.fuel_type = "휘발유";
		avante.model_name = "avante 16";
		avante.release_year = 2022;

		peugeot.doAccelerate();
		avante.doAccelerate();
		peugeot.turnRight();
		avante.turnLeft();
		peugeot.doBreak();
		avante.doBreak();
		avante.changeGear();
		avante.doAccelerate();
		
		System.out.println(peugeot);
		System.out.println(avante);
		
	}

}
