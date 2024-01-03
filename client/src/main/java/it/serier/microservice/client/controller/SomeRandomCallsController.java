package it.serier.microservice.client.controller;

import it.serier.microservice.client.client.NumberOneClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SomeRandomCallsController {

    private final NumberOneClient clientNumberOne;

    public SomeRandomCallsController(NumberOneClient clientNumberOne) {
        this.clientNumberOne = clientNumberOne;
    }

    @GetMapping("test")
    public String getTest() {
        try {
            return "Answer from client \n" + clientNumberOne.getSomeData();
        } catch (Throwable exception) {
            System.out.println(exception.getLocalizedMessage());
            return "Foutje";
        }
    }
}
