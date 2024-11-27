package com.northcoders.drinksapi.service;

import com.northcoders.drinksapi.model.Coffee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service

public class CoffeeService {
    private static final AtomicInteger idGenerator = new AtomicInteger(1);

    @Autowired
    CoffeeService coffeeService;

    public static Coffee makeCoffee(String coffeeName) {
        return new Coffee(idGenerator.getAndIncrement(), coffeeName);
    }
}
