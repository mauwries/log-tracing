package it.serier.microservice.client.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "numberOne", url = "${client.localhost.ip}:8011")
public interface NumberOneClient {

    @GetMapping("/test1")
    String getSomeData();
}
