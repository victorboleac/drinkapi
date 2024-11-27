package com.northcoders.drinksapi.controller;

import com.northcoders.drinksapi.model.Coffee;
import com.northcoders.drinksapi.service.CoffeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RestController

public class CofeeControler {

    @GetMapping("/coffee")
    public Coffee getCoffee(@RequestParam(value = "name", defaultValue = "latte") String name) {
        return CoffeeService.makeCoffee(name);
    }
}
