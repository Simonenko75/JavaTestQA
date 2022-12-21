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

}
