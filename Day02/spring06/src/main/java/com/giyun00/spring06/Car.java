package com.giyun00.spring06;

public class Car{
    public String name;
    public int year;
    String company;

    public void printCarName() {
        System.out.println("차 이름은 "+ name);
    }

    //메서드 오버로딩
    public void printCarname1(String point) {
        System.out.println("내가 정한 차 이름은 "+ point);
    }

    public void printCarcompany() {
        System.out.println("차 회사는 "+ company);
    }

    // 가변인자
    public void printCarNames(String ... name){
        for (String n: name){
            System.out.println(n);
        }
    }

    public int calcYear(int currYear){
        return currYear -year;
    }

    public void printYear(int point) {
        System.out.println("내가 정한 차 년식은은 "+ point);
    }

 }
