package com.giyun.spring14;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring14Application {

	public static void main(String[] args) {

		int num = 10;
		float fnum = 3.14F;
		double dnum = 3.14;
		long lnum = 10000000000L;

		Integer num2 = 10;
		Float fnum2 = 3.14F;
		Double dnum2 = 3.14;
		Long lnum2 = 10000000000L;


		SpringApplication.run(Spring14Application.class, args);




		// 제네릭 문자열 사용
		Storage<String> storage = new Storage<>();
		storage.setItem("ionic");
		System.out.println(storage.getItem());

		// 제네릭 정수사용
		Storage<Float> storage2 = new Storage<>();
		storage2.setItem(3.141592F);
		System.out.println(storage2.getItem());

		// 리턴타입 및 인자가 모두 제네릭일때 처리
		Spring14Application app = new Spring14Application();
		System.out.println(app.convert(storage));
		System.out.println(app.convert(storage2));
		
	}

	public <T> List<Character>  convert(Storage<T> storage) {
		// 제네릭을 사용하여 Storage 객체를 변환하는 메서드
		ArrayList<Character> list = new ArrayList<>();

		String s = String.valueOf(storage.getItem());
		for (int i = 0; i < s.length(); i++) {
			list.add(s.charAt(i));
		}
		return list;
	}

	public void print(Storage<? extends Storage> storage) {
		// 와일드 카드 사용
		System.out.println(storage.getItem());
		
	}

}
