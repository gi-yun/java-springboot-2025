package com.giyun00.spring05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring05Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring05Application.class, args);

		// 배열
		int[] score = {90, 98 , 100 , 76 ,83};

		System.out.println(score.length);
		
		score[4] =  85;
		
		System.out.println(score);

		// for each문
		for(int num : score){
			System.out.println(num);
		}
		System.out.println("=====================================");
		for (int i=0; i <score.length; i++){
			System.out.println(score[i]);
		}
		
		// 두 번째 배열
		String[] carcompany = { "Hyundai", "Kia", "Toyota", "Benz", "BMW", "Tesla"};
		
		for (String car : carcompany) {
			System.out.println(car);
		}
		
		System.out.println("=====================================");
		for (int i=0; i <carcompany.length; i++){
			System.out.println(carcompany[i]);
		}
		
		System.out.println("=====================================");

		// List<String> car_list = Arrays.asList(carcompany); //수정 불가능한 고정 크기 리스트
		// car_list.add("Ford");  // ❌ 여기서 예외 발생
		List<String> car_list = new ArrayList<>(Arrays.asList(carcompany)); // 리스트의 크기(사이즈) 는 배열과 동일하게 고정돼.
		car_list.add("Ford");  // 이제 예외 없이 동작함
		System.out.println(car_list);
		
		System.out.println("=====================================");
		Arrays.sort(score);
		for(int num : score){
			System.out.println(num);
		}

		System.out.println("=====================================");
		
		Arrays.sort(carcompany,Collections.reverseOrder());
		for (String cars : carcompany){
			System.out.println(cars);
		}
		System.out.println("=====================================");
	}

}
