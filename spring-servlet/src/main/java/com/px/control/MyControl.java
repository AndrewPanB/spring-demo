package com.px.control;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "spring/demo")
public class MyControl {

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello";
    }
}
