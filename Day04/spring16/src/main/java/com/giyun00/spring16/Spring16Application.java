package com.giyun00.spring16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring16Application {

	public interface myMax {
		int max(int a, int b);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Spring16Application.class, args);

		// 람다식
		// 1. 일반 방식
		Spring16Application app = new Spring16Application();
		System.out.println(app.helloJava());

		// 2. 람다 방식
		myFuncInterface myFunc = () -> System.out.println("Hello, Java!");
		myFunc.printHello();

		myCalc myCalc = (a, b) -> a + b;
		System.out.println(myCalc.calc(10, 20));

		//////////////////////// GPT ////////////////////////
		
		
		// 2. 기존익명함수
		System.out.println(new myMax() {
			public int max(int a, int b) {
				return (a > b) ? a : b;
			}
		}.max(10, 20));


		// 3. 람다식
		myMax mymax = (a, b) -> (a > b) ? a : b;
		System.out.println(mymax.max(10, 20));

		// 4. 람다식 + 메소드 레퍼런스
		myMax mymax2 = Math::max;
		System.out.println(mymax2.max(10, 20));


		/////////////////////////////////////////////////////

		// Stream API
		// 1. 기존방식식
		List<String> avengers = Arrays.asList("IronMan", "Captain", "SpiderMan", "Hulk" , "AntMan");
		
		// 정렬
		Collections.sort(avengers);
		System.out.println(avengers);
		System.out.println("==================================");
		for (String hero : avengers) {
			System.out.println(hero);
		}
		// 단점은 출력시 반복문써야하고, 정렬후 원본 순서가 사라짐
		System.out.println("==================================");
		// 람다식식
		avengers.stream()
		.sorted() // 정렬
		.forEach(System.out::println); // 출력


		// // 역정렬
		// Collections.sort(avengers, Collections.reverseOrder());
		// System.out.println(avengers);

		// 2. 스트림API 사용방식
		// 스트림 API는 자바 8부터 추가된 기능으로, 컬렉션을 다루기 위한 새로운 방법이다.
		// 스트림 API는 컬렉션을 다루기 위한 새로운 방법으로, 람다식과 함께 사용된다.
		avengers = Arrays.asList("IronMan", "Captain", "SpiderMan", "Hulk" , "AntMan");
		
		Stream<String> avengersStream = avengers.stream(); // 스트림 생성
		// 스트림은 한 번만 사용할 수 있다. 따라서, 스트림을 사용한 후에는 다시 사용할 수 없다.
		avengersStream.sorted().forEach(System.out::println); // 정렬 후 출력
		System.out.println(avengers);
		System.out.println("==================================");
		
		
		// 스트림API 실습
		List<String> originList = Arrays.asList("a1", "c2", "b3", "c1", "a2", "b1");
		
		// Copy 해서 선언한 후 c로 시작하는 요소만 뽑아서, 대문자로 변경하고, 정렬해서 , 갯수를 출력하시오.
		// originList는 원본 리스트
		// 1. 기존방식
		List<String> copyList = new ArrayList<>(originList);
		// copyList는 c로 시작하는 요소들만 담기기
		for (int i = 0; i < copyList.size(); i++) {
			if (!copyList.get(i).startsWith("c")) {
				copyList.remove(i);
				// 인덱스가 변경되므로, i를 감소시켜야 한다. 
				// 즉 계속 i 는 0부터 시작하게 된다.
				i--; 
			}
		}
		// 대문자로 변경
		for (int i = 0; i < copyList.size(); i++) {
			copyList.set(i, copyList.get(i).toUpperCase());
		}
		Collections.sort(copyList);
		System.out.println("기존: "+copyList);
		System.out.println(copyList.size());
		System.out.println(originList);

		System.out.println("==================================");

		// 다른 방식
		List<String> lastList = new ArrayList<>();
		for (String s : originList) {
			if (s.startsWith("c")) {
				lastList.add(s.toUpperCase());
			}
		}
		Collections.sort(lastList);
		System.out.println("기존2: "+lastList);
		System.out.println(lastList.size());
		System.out.println(originList);
		System.out.println("==================================");

		
		// 2.스트림API를 사용한 방식
		// 스트림API를 사용하면, 기존 리스트를 복사하지 않고도, 원본 리스트에서 직접 작업할 수 있다.
		List<String> result = originList.stream()
		.filter(s -> s.startsWith("c")) // c로 시작하는 요소 필터링
		.map(String::toUpperCase) // 대문자로 변환
		.sorted() // 정렬
		.toList(); // 리스트로 변환
		System.out.println("람다: " + result);
		System.out.println(result.size());
		System.out.println(originList);
		
		System.out.println("==================================");
		

		




	}	
	public String helloJava() {
		return "Hello, Java!";
	}
	@FunctionalInterface // 함수형 인터페이스로 지칭. 함수형 인터페이스 만들때 지켜야할 규칙
	// 1. 단 하나의 추상 메소드만 가질 수 있다.
	// 2. Object 클래스의 메소드는 제외한다.
	// 3. @FunctionalInterface 어노테이션을 붙여준다.
	public interface myFuncInterface { // 함수형 인터페이스로 지칭
		void printHello();
	}

	public interface myCalc {
		int calc(int a, int b);

		
	}

}
