package com.example.greetingservice;

import org.springframework.stereotype.Component;

import javax.jws.WebService;

@Component(value = "greetingService")
@WebService(endpointInterface = "com.example.greetingservice.GreetingService")
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String greeting() {
        return "Hello World!";
    }
}
