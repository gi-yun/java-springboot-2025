package com.giyun00.spring13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring13Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring13Application.class, args);

		// 날짜 타입
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);

		LocalDate date2 = LocalDate.of(2017, 07, 9);
		System.out.println(date2);

		// Date format
		String date3 = LocalDateTime.now().format(
			DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
		);
		
		System.out.println(date3);
		System.out.println(LocalDate.now().getYear());
		System.out.println(LocalDate.now().getMonth());
		System.out.println(LocalDate.now().getMonthValue());
		System.out.println(LocalDate.now().getDayOfYear());
		System.out.println(LocalDate.now().getDayOfMonth());
		System.out.println(LocalDate.now().getDayOfWeek());

		// 날짜차이
		System.out.println(LocalDate.now().plusDays(2));
		System.out.println(LocalTime.now().plusHours(2));


	
	}


		
}
