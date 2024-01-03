package it.serier.microservice.server.numberone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.serier.microservice.server.numberone.client.NumberTwoClient;

@RestController
@RequestMapping
public class SomeRandomCallsController {
private final NumberTwoClient clientNumberTwo;

    public SomeRandomCallsController(NumberTwoClient clientNumberTwo) {
        this.clientNumberTwo = clientNumberTwo;
    }

    @GetMapping("test1")
    public String getTest(){
        System.out.println("Got called");
        return "Answer from server 1 \n" +clientNumberTwo.getSomeData();
    }
}
