package com.isap.quikstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public String hello() {
        return  "hi sami alam java from java spring Boot framework";
    }
}
