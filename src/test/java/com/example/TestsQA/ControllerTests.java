package com.example.TestsQA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;


public class ControllerTests {

    private TestController controller;

    @BeforeEach
    public void init() {
        controller = new TestController();
    }

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }



//    @Test
//    public void greetingShouldReturnDefaultMessage() throws Exception {
//        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/",
//                String.class)).contains("Hello, World");
//    }

//    @Test
//    public void greetingShouldReturnMessageFromService() throws Exception {
//        when(controller.getEntity()).thenReturn("Hello, Mock");
//        this.mockMvc.perform(get("/get/entities")).andDo(print()).andExpect(status().isOk())
//                .andExpect(content().string(containsString("Hello, Mock")));
//    }

}
