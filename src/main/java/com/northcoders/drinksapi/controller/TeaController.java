package com.northcoders.drinksapi.controller;
import com.northcoders.drinksapi.model.Tea;
import com.northcoders.drinksapi.service.TeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeaController {

    @Autowired
    TeaService teaService;

    @GetMapping("/tea")
    public Tea getCoffee(@RequestParam(value = "name", defaultValue = "black tea") String name) {
        return teaService.makeTea(name);
    }
}
