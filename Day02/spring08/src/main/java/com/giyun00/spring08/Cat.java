package com.giyun00.spring08;


// Animal 부모클래스를 상속한 Cat 클래스
public class Cat extends Animal{

    // 부모 메서드 오버라이딩
    void cry1(){
        System.out.println(super.getName() + "이(가) 웁니다. 냐옹");
    }
}
