package com.example.springboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hello")
public class HelloRestController {

    @GetMapping
    public String sayHello(){
        return "Hello World this is Openshift !!!";
    }
}
