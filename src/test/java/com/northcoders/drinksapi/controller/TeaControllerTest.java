package com.northcoders.drinksapi.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureMockMvc
@SpringBootTest
public class TeaControllerTest {

    @Autowired
    private MockMvc mockMvcController;

    @Test
    public void testGetTeaByName() throws Exception {

        String teaName = "green";

        this.mockMvcController.perform(
                        MockMvcRequestBuilders.get("/tea").param("name", teaName))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value(teaName))
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(1));
    }

    @Test
    public void testGetTeaByDefault() throws Exception {

        this.mockMvcController.perform(
                        MockMvcRequestBuilders.get("/tea"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("black tea"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(2));
    }
}

