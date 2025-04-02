package com.giyun00.spring06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring06Application {
	
	// static 정적 메서드에서는 같은 클래스내 일반 메서드를 호출할 수 없음
	// 정적 메서드는 같은 클래스내 정적 메서드만 호출할 수 있음.
	// 다른 클래스는 상관이 없음
	// 정적 메서드는 클래스 인스턴스 생성없이(new) 바로 호출 할 수 있다.
	public static void main(String[] args) {
		SpringApplication.run(Spring06Application.class, args);

		//선언 static 없으면 선언해서 써야함
		Spring06Application app = new Spring06Application();

		//Car 클래스 인스턴스 생성
		Car mycar = new Car(); 
		
		//메서드
		// test.testHello();
		app.printHello();
		app.testHello();
		sayHi();
		
		if (isEven(3) ==true) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("탈락입니다.");
		}

		mycar.name = "아이오닉";
		mycar.year = 2018;
		mycar.company = "현대";
		String point = "소나타";
		mycar.printCarName();
		mycar.printCarname1(point);
		mycar.printCarNames("테슬라", "벤츠", "베엠베", "페라리"); // 가변인자 메서드 호출
		mycar.printYear(16);
		int term = mycar.calcYear(2025);
		System.out.println(term + "년 동안 사용");

	}

	public void printHello(){
		System.out.println("Hello, Spring");
	}

	public static void sayHi(){
		System.out.println("Hi, Spring");
	}

	public static boolean isEven(int num){
		boolean is = true;
		if (num % 2 == 0){
			System.out.println("이븐하게 구워졌습니다.");
			return is;
			
		} else {
			is = false;
			System.out.println("이븐하지 못함.");
			return is;
		}
	}

	public void testHello() {
		System.out.println("Hello, Spring(class선언)");
	}


	

	

}
