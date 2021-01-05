package com.androedge.restful.controllers;

import com.androedge.restful.dto.HelloWorldDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldDto helloWorldBean() {
        return new HelloWorldDto("Hello World bean!");
    }

    @GetMapping("/hello-world/path-variable/{name}")
    public HelloWorldDto helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldDto(String.format("Hello World, %s", name));
    }

    @GetMapping("/feature-two")
    public String featureTwo() {
        // test message
        return "feature 2 test";
    }






}
