package kopo.poly.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class MainController {


    @GetMapping("/main")
    public String main() throws Exception {
        log.info(this.getClass().getName() + ".main 페이지 보여주는 함수 실행");

        return "/main";
    }

    @GetMapping("/a")
    public String a() throws Exception {
        log.info(this.getClass().getName() + ".a 페이지 보여주는 함수 실행");

        return "a";
    }
}
//굳이 컨트롤러를 여러개 만들 필요는 없음