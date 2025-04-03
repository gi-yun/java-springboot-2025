package com.giyun00.spring09;

// interface는 implements 키워드를 사용해야함.
public class Cat implements Animal {

    private String name;
    private int age;


    // 생성자
    Cat(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override // 이제부터 오버라이딩 할꺼야
    public void cry() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'cry'");
        System.out.println(this.age + "살 "+ this.name +" 이(가) 웁니다. 냐옹");
    }
    
}
