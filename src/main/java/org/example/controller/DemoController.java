package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Value("${didispace.title}")
    private String title;
    @Value("${didispace.msg}")
    private String msg;

    @GetMapping("/hello")
    public String hello(){
        log.info("didispace.title:"+title);
        log.info("didispace.msg:"+msg);
        return "hello yinke";
    }

    @GetMapping("/jenkins")
    public String jenkins(){
        log.info("测试jenkins");
        return " 测试jenkins success!";
    }


}
