package com.giyun01.spring02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner; // 콘솔 입력받을 클래스 선언


@SpringBootApplication
public class Spring02Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring02Application.class, args);

		Scanner scan = new Scanner(System.in);
		
		System.out.print(">>아이디 입력: ");
		String userid = scan.next();
		System.out.print(">>비밀번호 입력: ");
		String passwd = scan.next();

		System.out.println("입력 아이디 --> " + userid);
		System.out.println("입력 비밀번호 --> " + passwd);

		// if문
		if(userid.equals("giyun00") && passwd.equals("1234")){
			System.out.println("로그인성공!");
		} else {
			System.out.println("로그인실패!");
		}

		// switch(case)문
		switch (passwd) {
			case "1234":
				System.out.println("패스워드 변경요망");
				break;
		
			default:
				System.out.println("패스워드 미일치!");
				break;
		}

		// 3항연산자
		String result = userid.equals("giyun00") && passwd.equals("1234") ? "로그인성공!" : "로그인실패!";
		System.out.println("3항연산자 "+result);

		scan.close();
	}
	
}
