package com.example.consumer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/consumer")
public class ConsumerController {

    @GetMapping
    public String getConsumer(){
        return "Here is consumer";
    }

}
