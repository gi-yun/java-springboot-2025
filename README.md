# java-springboot-2025
2025년 부경대 Java개발자 과정 SpringBoot 리포지토리

## 1일차(04-01)
- 자바웹 개발 워크북 으로 교육
    - https://cafe.naver.com/gugucoding (카페)
    - https://github.com/ckck24(깃허브)
### 웹 개요
- 구성 3단계
    - 브라우저(클라이언트/프론트엔드) - 사용자 **요청(request)**을 하고, 결과를 돌려받는 파트
    - 서버(백엔드) - 사용자의 요청을 받아서 DB에서 데이터를 가져와 처리하고, 사용자에게 **응답(response)**하는 파트
    - 데이터베이스 - 가장 중요한 데이터가 저장되어 있는 파트
- 웹 개념
    - 사용자 Request(요청)에 대한 서버의 Response(응답)

### Spring Boot 개요
- Java - 컴퓨팅 세상 모든곳에서 사용될 수 있는 언어가 되고자 개발됨
- Java 웹 개발
    1. CGI - (Common Gateway Interface) - HTTP 프로토콜에서 정적인 데이터만 전달할 수 있는 웹 기술
    2. Servlet - CGI를 개선한 Java 웹 기술 동적웹을 개발할 수 있음.
        - HTML 코드를 전부다 Java에서 작성해야 함.
    3. EJB(Enterprise Java Bean) - 서블릿으로 대형 프로젝트를 개발할 수 있는 Java 웹기술
        - 무지하게 복잡!
    4. JSP(Java Servaer Page) - 웹 페이지 코드(HTML)에 자바소스를 포함시켜 개발할 수 있는 Java 웹 기술
        - 확장자가 .jsp / 스파게티 코드
    5. Spring - Java웹 개발에 전성기. 웹페이지와 자바영역 분리
        - 대한민국 전자정부 웹프레임워크 기반
        - 설정이 복잡.
    6. Spring Boot - Spring의 단점을 최소화. 설정을 간결화
    <br>
- Spring Boot 
    - https://spring.io/projects/spring-boot
    - Spring 기술을 그대로 사용(마이그레이션이 간단)
    - JPA 기술을 사용하면 ERD나 DB설계를 하지 않고도 손쉽게 DB를 생성. DB연동도 쉬움
    - Tomcat Webserver가 내장! (설치 필요없음)
    - 서포터하는 기능 다수 존재(개발을 하기쉽게 도와줌)
    - 테스트용 JUnit, 로그용 Log4J2 모두 포함(설치 필요없음)
    - 프론트엔드를 다양하게 지원. JSP, **Thymeleaf**, Mustache 등
    - React, View.js 등의 자바스크립트 프론트엔드와 연계해서 풀스택 개발 가능
    - MVC(Model, View, Controller)로 영역을 분리. 각 부분별로 따로 개발
    <br>
- MVC
    <img src="./image/sb001png.png">

### Spring Boot 개발환경 설정
- 필요요소 
    - Java, 개발툴, DB

- Java
    - Java Runtime과 JDK(Java Developer Kit) 존재
        - Oracle 외에도 OpenJDK가 존재
        - https://www.azul.com/downloads/?package=jdk#zulu 
        - https://adoptium.net/
        - https://jdk.java.net/
        
    - Java 17버전 이상 설치
    - https://www.oracle.com/java/technologies/javase/jdk17-0-13-later-archive-downloads.html
    - jdk-17.0.13_windows-x64_bin.msi 설치

    - 시스템정보에서 PATH 설정 (환경변수 win+ PauseBreak)
        - 새로만들기
            - JAVA_HOME - 본인경로 추가(ex: C:\Dev\Lang\Java\jdk-17)
        - path %JAVA_HOME%\bin 추가, 맨 위로
        - powershell
            - java --version 으로 확인
- Visual Studio Code 확장 설치
    - Java 검색
        - Extension Pack for Java 설치! Debugger for Java 등 총 7가지 확장 설치

### Java 기본 실행
- VS Code에서 명령팔레트 실행(Ctrl + Shift + p)
    - Java create
        1. build tool > Maven
        2. no ArchType 선택
        3. Group ID 입력(com.example)
        4. Artifact ID 입력 (demo)
        5. 저장위치 결정

### Spring Boot 설정
- Visual Studio Code 확장 설치
    -  Spring 검색
        - Spring Boot Extension Pack 설치(추가 3개 확장 같이 설치됨)
        <img src="image/sb001-1.png">
    - Gradle for Java 설치(Extension Pack for Java 설치시 같이 설치됨)

### Spring Boot 기본 실행(Java 프로젝트)
- VS Code에서 명령팔레트 실행
    - Spring initializr : Create a Maven Project 
    - Specify Spring Boot version: 3.3.10 선택
    - Specify project language: Java 
    - Input Group Id : 본인아이디 입력 /com.giyun00
    - Input Artifact Id : 본인아이디 입력 /spring01
    - Specify packaging type : Jar(Java archive, 압축파일)
    - Specify Java version : 17
    - Choose dependencies : Selected 0 dependencies (현재는 선택하지 않음)
    - 저장위치 선택 
    - **새 창 열기**  - Spring Boot 프로젝트가 루트폴더가 된 개발환경

- 실행방법
    - 코드 작성
    - Spring Boot Dashboard > Apps > 앱 실행 Ctrl +F5

- 기초문법
    - [JAVA기초문법](JAVA_BASIC.md)
    - 기본, 변수, 자료형, 연산자, 흐름제어

## 2일차
- 기초문법 계속
    - [JAVA기초문법](JAVA_BASIC.md)
    - 흐름제어(반복문), 배열, 메서드, 객체/클래스, 상속
## 3일차
- 기초문법 계속
    - [JAVA기초문법](JAVA_BASIC.md)
    - 상속, 인터페이스, 예외처리, 제네릭, 컬렉션, 프레임워크, 입출력

## 4일차
- 기초문법 마무리
- Spring Boot 시작

## 5일차

## 6일차(06-26)

