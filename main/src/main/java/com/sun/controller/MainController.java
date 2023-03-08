package com.sun.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class MainController {

    @GetMapping("/")
    public String aa() {
        return "恭喜您访问成功";
    }
    @GetMapping("/hello")
    public String bb(){
        return "你好,猪头";
    }
    @GetMapping("/list/{name}")
    public String cc(@PathVariable String name){
        return "nihao: " + name;
    }
}
