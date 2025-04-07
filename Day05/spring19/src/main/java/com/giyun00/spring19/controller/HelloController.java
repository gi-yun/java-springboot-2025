package com.giyun00.spring19.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.slf4j.Logger; // SLF4J 로거 인터페이스

// 어노테이션을 붙여서 스프링이 관리하는 객체로 등록
// @Controller는 @Component의 특수화된 형태로, 주로 MVC 패턴에서 컨트롤러 역할을 수행하는 클래스에 사용됩니다.  
@Controller 
public class HelloController {

    private final Logger logger = (Logger) LoggerFactory.getLogger(this.getClass()); // 로거 객체 생성



    @GetMapping("/hello") // /hello URL 요청을 처리하는 메서드
    @ResponseBody // 메서드의 반환값을 HTTP 응답 본문으로 사용
    public String helloSpring() {
        System.out.println("hello() 메서드 호출됨"); // 콘솔에 출력
        logger.info("hello URL 오픈!"); // 로그에 출력
        // 문제발생시 로그를 남길때
        logger.debug("디버그시 필요한 로그에요"); // 디버그 로그에 출력
        logger.trace("디버그시 필요한 로그에요"); // 트레이스 로그에 출력

        logger.warn("경고표시 나타내는 로그입니다."); // 경고 로그에 출력
        logger.error("오류표시 나타내는 로그입니다."); // 에러 로그에 출력
        String str = "Hello, SpringBoot"; // 문자열 변수 str에 "Hello, SpringBoot" 저장
        return str; // str을 반환
    }
}
