package com.example.apigatewayconfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiGateWayController {

    @GetMapping
    public String getApiGateWay(){
        return "Default";
    }


}
