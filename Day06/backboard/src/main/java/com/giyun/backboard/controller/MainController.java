package com.giyun.backboard.controller;

import org.springframework.stereotype.Controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class MainController {

    @GetMapping("/start") // REST API의 GET 요청을 처리하는 메서드
    public String start() {
        log.info("/start 실행!"); // 로그 출력
        return "start"; // resources/templates/start.html로 이동
    }

}
