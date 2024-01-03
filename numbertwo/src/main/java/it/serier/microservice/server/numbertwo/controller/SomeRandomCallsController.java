package it.serier.microservice.server.numbertwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SomeRandomCallsController {

    @GetMapping("test2")
    public String getTest() {
        System.out.println("Got called");
        return "Answer from server 2";
    }
}
