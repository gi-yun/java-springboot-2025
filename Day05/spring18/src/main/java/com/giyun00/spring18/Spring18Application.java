package com.giyun00.spring18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring18Application {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(Spring18Application.class, args);

		// 파일 쓰기, FileOutputStream
		FileOutputStream output = new FileOutputStream("C:/temp/test.txt");
		
		// 뭘하고...
		for (int i = 0; i < 10; i++) {
			StringBuilder sb = new StringBuilder("FileOutputStream "+(i+1)+"번째 줄입니다.\n");
			output.write(sb.toString().getBytes(Charset.defaultCharset()));
		}
		output.close();
		System.out.println("파일 생성 완료!");


		// 파일 읽기, FileWriter
		FileWriter fw = new FileWriter("C:/temp/fwtext.txt");

		for (int i = 0; i < 10; i++) {
			StringBuilder str = new StringBuilder("FileWriter "+(i+1)+"번째 줄입니다.\n");
			fw.write(str.toString());
		}
		fw.close();
		System.out.println("FileWriter 파일 생성 완료!");


		// PrintWriter - \n 자동 추가
		PrintWriter pw = new PrintWriter("C:/temp/pwtext.txt");
		for (int i = 0; i < 10; i++) {
			String str = ("PrintWriter "+(i+1)+"번째 줄입니다.");
			pw.println(str);
		}
		pw.close();
		System.out.println("PrintWriter 파일 생성 완료!");

		// FileWriter  추가모드 사용
		FileWriter fw2 = new FileWriter("C:/temp/fwtext.txt", true);
		for (int i = 10; i < 20; i++) {
			StringBuilder str = new StringBuilder("FileWriter "+(i+1)+"번째 줄입니다.\n");
			fw2.write(str.toString());
		}
		fw2.close();
		System.out.println("FileWriter 추가 생성 완료!");


		// PrintWriter는 FileWriter를 활용해서 추가모드 사용
		PrintWriter pw2 = new PrintWriter(new FileWriter("C:/temp/pwtext.txt", true));
		for (int i = 10; i < 20; i++) {
			String str = ("PrintWriter "+(i+1)+"번째 줄입니다.");
			pw2.println(str);
		}
		pw2.close();
		System.out.println("PrintWriter 추가 생성 완료!");

		// FileInputStream - 한번에 전부를 읽어올 때
		byte[] b = new byte[2048];
		FileInputStream input = new FileInputStream("C:/temp/fwtext.txt");
		input.read(b); // 글자를 전부 읽어서 바이트배열에 할당
		System.out.println(new String(b)); // 바이트배열을 문자열로 변환
		input.close();
		System.out.println("FileInputStream 읽기 완료!");

		// BufferedReader - 한줄씩 읽어올 때
		BufferedReader br = new BufferedReader(new FileReader("C:/temp/fwtext.txt"));
		String str = null;
		while ((str = br.readLine()) != null) { // 한줄씩 읽어오기
			System.out.println(str);
		}
		
		// while(true){
		// 	String line = br.readLine(); // 한줄씩 읽어오기
		// 	if(line == null) break; // 더이상 읽을게 없으면 종료
		// 	System.out.println(line); // 읽은 줄 출력
		// }
		br.close();
		System.out.println("BufferedReader 읽기 완료!");
		

	}
	


}

