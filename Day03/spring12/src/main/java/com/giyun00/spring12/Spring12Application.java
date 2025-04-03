package com.giyun00.spring12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring12Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring12Application.class, args);

		// 문자열,  시간타입 핸들링
		String greeting = "Hello";
		System.out.println(greeting);
		String hi = new String("Hello"); // 기본
		System.out.println(hi);

		System.out.println(greeting == hi); // 둘이 같은 주소를 쓰는 변수인지 질문
		System.out.println(greeting.equals(hi)); //  둘이 가지고 있는 데이터가 같은지

		String string3 = hi; // string3번에 hi 의 주소를 할당

		System.out.println(hi == string3); // 주소도 같고!!
		System.out.println(hi.equals(string3)); //데이터도 같다!!!

		// 문자열 메서드 연습
		String carstr = "avante, ionic, x3"; // 일반적 사용
		String cars[] = carstr.split(",");
		for (String car : cars){
			System.out.println(car.trim().toUpperCase()); // 공백제거, 대문자로 적용
		}

		// for (String car : cars){
		// 	System.out.println(car.toUpperCase());
		// }

		String caresult1 = carstr.replace(", ", "/");
		System.out.println(caresult1);
		String caresult2 = carstr.replace(',', '/'); // Java에서 ''는 Char(글자 한 글자)
		System.out.println(caresult2);

		char[] charList = hi.toCharArray();
		for (char oneChar : charList){
			System.out.println(oneChar);
		}

		System.out.println(caresult1.indexOf("io")); // avante/ionic/x3 io의 위치는 7
		System.out.println(caresult1.lastIndexOf("n")); // avante/ionic/x3 에서 마지막 n 의 위치 9
		System.out.println(caresult1.length()); // avante/ionic/x3 의 길이 15

	}

}
