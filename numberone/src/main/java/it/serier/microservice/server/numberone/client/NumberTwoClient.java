package it.serier.microservice.server.numberone.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "numberTwo", url = "http://localhost:8022")
public interface NumberTwoClient {

    @GetMapping("/test2")
    String getSomeData();
}

