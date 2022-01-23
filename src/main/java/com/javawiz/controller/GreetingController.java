package com.javawiz.controller;

import com.javawiz.SampleProp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class GreetingController {

    @Value("${app.message}")
    private String greetingMessage;

    @Value("Some hardcode message")
    private String hardcode;

    @Value("${app.list}")
    private List<String> list;

    @Value("#{${app.map}}")
    private Map<String, String> map;

    @Autowired
    private SampleProp sampleProp;

    @GetMapping("/hello")
    public String getGreeting(){
        return greetingMessage +", "+hardcode+", "+list+", "+map+", "+sampleProp;
    }
}
