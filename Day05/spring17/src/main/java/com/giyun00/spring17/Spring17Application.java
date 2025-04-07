package com.giyun00.spring17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring17Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring17Application.class, args);

		//StringBuilder
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.append(" World");
		sb.append("!"); 
		System.out.println(sb.toString());
		System.out.println(sb); // --> StringBuilder  객체만으로도 출력 가능

		StringBuilder sb2 = new StringBuilder("Hi ");
		sb2.append("giyun00");
		System.out.println(sb2.toString());

		//리스트처럼 중간에 내용을 삽입가능
		sb2.insert(3, "nice to meet you, ");
		System.out.println(sb2.toString()); // Hi nice to meet you, giyun00
		// 문자열 길이
		System.out.println(sb2.length()); // 28
		// 문자열 삭제
		sb2.delete(19, 28);
		System.out.println(sb2.toString()); // Hi nice to meet you
		// 인덱스위치 문자하나 삭제
		sb2.deleteCharAt(3);
		System.out.println(sb2.toString()); // Hi ice to meet you

		// 문자열을 거꾸로 출력
		System.out.println(sb2.reverse().toString()); // uoy teem ot eciH
		sb2.reverse(); // 원래대로 돌리기
		
		// 문자열 치환
		sb2.replace(0, 3, "Hello, n"); 
		System.out.println(sb2.toString()); // Hello, nice to meet you

		// 문자열 자르기
		String str = sb2.substring(0, 5); // 0~4까지 자르기
		System.out.println(str); // Hello
		System.out.println(sb2.substring(7)); // nice to meet you

		StringBuilder sb3 = new StringBuilder("      Hello	  ");
		
		// 문자열 공백 제거
		System.out.println(sb3.toString().trim()); // Hello

		// StringBuffer
		StringBuffer sbf = new StringBuffer();
		sbf.append("Hello");
		sbf.append(" World");
		sbf.append("!");
		System.out.println(sbf.toString());
		System.out.println(sbf); // --> StringBuffer  객체만으로도 출력 가능
		
		

	}

}
