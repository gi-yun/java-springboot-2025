package com.giyun00.spring10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring10Application {
	

	public void sayNickName(String nickName) throws Exception {
		if (nickName.equals("애슐리")){
			throw new Exception("이 별명은 안돼요~!!!");
		}
		System.out.println("당신의 별명은 " + nickName);
	}
	
	
	
	public static void main(String[] args) throws Exception
	{
		SpringApplication.run(Spring10Application.class, args);
		// 선언
		Spring10Application app = new Spring10Application();

		// 예외처리
		int result = 0;
		try{
			result = 17 /0;
		} catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println(result);

		System.out.println("======================================");

		String[] names = {"giyun", "Ashley", "Jini"};
		try{
			System.out.println(names[3]);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		} finally {
			System.out.println("예외발생 유무와 상관없이 실행");
			// DB를 연결 종료, 파일클로즈, 네트워크연결 끊기
		}

		// 예외클래스. 
		String name2 = "10월~12월";
		String[] names2= name2.split("~");
		try{
			System.out.println(names2[0]);
		} catch(NullPointerException e){
			System.out.println("에러문구 : "+e.getMessage());
		}


		System.out.println("프로그램 종료!"); //정상적으로 프로그램 종료

		app.sayNickName("기기윤");
		app.sayNickName(null);


	}

}
