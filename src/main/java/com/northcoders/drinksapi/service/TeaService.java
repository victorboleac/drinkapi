package com.northcoders.drinksapi.service;
import com.northcoders.drinksapi.model.Tea;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;
@Service
public class TeaService {
    private static final AtomicInteger idGenerator = new AtomicInteger(1);


    public static Tea makeTea(String teaName) {
        return new Tea(idGenerator.getAndIncrement(), teaName);
    }
}
