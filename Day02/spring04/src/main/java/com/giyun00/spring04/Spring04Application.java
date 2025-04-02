package com.giyun00.spring04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring04Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring04Application.class, args);

		// while문
		int num = 10;

		while(num >=0){
			System.out.println(num);
			num--;
			
		}
		System.out.println("while문 종료");

		int cnt = 1;
		do{
			System.out.println(cnt);
			cnt++;
		}while(cnt<10);
		System.out.println("do~while문 종료");
		num =1;
		while(num < 11){
			if(num % 2 == 0) {
				System.out.println("num이 짝수이면 탈출 : "+ num);
				num++; // 1씩 증가;
				break;
				//continue; // if문 조건이 참이면 빠져나가서 반복문 위로 올라감.
			}
			System.out.println("if문 들어간 while문 "+num);
			num++; // 1씩 증가;
		}
		System.out.println("while문 종료");
	}

}
