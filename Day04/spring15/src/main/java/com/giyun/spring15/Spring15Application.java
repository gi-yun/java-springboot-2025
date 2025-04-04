package com.giyun.spring15;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Arrays;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring15Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring15Application.class, args);

		// 컬렉션 프레임워크
		// List
		List<String> lst1 = new ArrayList<>();
		lst1.add("One");
		lst1.add("Two");
		lst1.add("Three");
		lst1.add("Four");

		System.out.println(lst1);

		List<String> lst2 = new ArrayList<>();
		lst2.add("Five");
		lst2.add("Six");

		lst1.addAll(lst2); // lst1에 lst2를 추가
		lst1.set(0, "Zero"); 

		System.out.println(lst1); // [Zero, Two, Three, Four, Five, Six]
		System.out.println(lst1.get(5)); // lst1의 6번째 인덱스 값

		// 연결리스트
		List<Integer> lst3 = new ArrayList<>();
		lst3.add(10);
		lst3.add(20);
		lst3.add(30);
		System.out.println(lst3); // [10, 20, 30]

		// 정렬
		Collections.sort(lst1);
		System.out.println(lst1); // [Five, Four, Six, Three, Two, Zero]

		// 역정렬
		// Collections.reverse(lst1);
		Collections.sort(lst1, Collections.reverseOrder());
		System.out.println(lst1); // [Zero, Two, Three, Four, Six, Five]

		System.out.println(lst1.contains("Three")); // lst1 리스트에 "Three"라는 문자열이 존재하는지 여부
		System.out.println(lst1.isEmpty()); // 리스트
		// !중요한 메서드
		// lst1.clear(); // 함부러 쓰지 말것! 프로그램 종료시 리스트를 비우는 것!


		// Vector
		Vector<String> vec1 = new Vector<>(10); //용량을 지정할 수 없다.
		vec1.add("One");
		vec1.add("Two");

		System.out.println("벡터! -> "+vec1.size()); // 2
		System.out.println("벡터 용량! -> " +vec1.capacity()); // 10

		// Set
		Set<String> set1 = new HashSet<>();
		set1.add("One");
		set1.add("Two");
		set1.add("Three");
		set1.add("Four");
		set1.add("Two"); // 중복된 값은 추가되지 않음

		System.out.println(set1);

		System.out.println(set1.contains("Three")); // lit1 리스트에 "Three"라는 문자열이 존재하는지 여부
		System.out.println(set1.isEmpty()); // lit1 리스트에 "Five"라는 문자열이 존재하는지 여부
		set1.remove("Four"); // set은 순서가 없기 때문에 지울 요소값을 입력해야 함!
		set1.removeAll(set1);// 모두 지운다.
		// set1.clear(); // 모두 지운다.
		set1.add("Five"); // 중복된 값은 추가되지 않음
		System.out.println(set1);

		//Map
		Map<String, String> phones = new HashMap<>();
		phones.put("010-9999-5555", "Galaxy S10");
		phones.put("010-0000-4444", "IPhone 14");
		phones.put("010-9898-6890", "Galaxy S24");
		phones.put("010-7845-6890", "Galaxy S24");

		System.err.println(phones);

		System.out.println(phones.get("010-9999-5555"));  // key 와 매칭되는 value가 출력
		System.out.println(phones.values()); // value 값만 출력
		System.out.println(phones.keySet()); // key 값만 출력
		System.out.println(phones.containsKey("010-9999-5555")); // key 값이 존재하는지 확인
		System.out.println(phones.containsValue("Galaxy S10")); // value 값이 존재하는지 확인
		System.out.println(phones.isEmpty()); // 비어있는지 확인

		// 샘플 - 학생 네명의 국어, 영어, 수학, 미술, 체육 점수 합산/ 평균
		List<Integer> std1 = Arrays.asList(96, 100, 55, 80, 70);
		List<Integer> std2 = Arrays.asList(100, 100, 99, 95, 96);
		List<Integer> std3 = Arrays.asList(50, 50, 40, 100, 90);
		List<Integer> std4 = Arrays.asList(85, 85, 84, 86, 80);

		Map<String, List<Integer>> students = new HashMap<>();
		students.put("홍길동", std1);
		students.put("애슐리", std2);
		students.put("성유고", std3);
		students.put("김기윤", std4);

		Scanner sc = new Scanner(System.in);
		System.out.println("성적 조회 할 학생 이름을 입력하세요: ");
		String isName = sc.nextLine();

		int sum = 0;

		for (int score : students.get(isName)) { // "홍길동" -> [96, 100, 55, 80, 70]
			sum += score; // 점수 합산
		}

		System.err.println(isName + "학생의 성적 총점 : " + sum + "점, " + " 평균 : " + (sum / students.get(isName).size()) + "점");
		sc.close();
	}

}
