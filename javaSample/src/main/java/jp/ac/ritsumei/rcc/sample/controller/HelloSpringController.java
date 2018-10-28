package jp.ac.ritsumei.rcc.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloSpringController {

    @GetMapping
    public String helloSpring() {
        return "Hello Spring!";
    }
}
