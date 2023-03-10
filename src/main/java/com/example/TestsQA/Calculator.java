package com.example.TestsQA;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public double div(int a, int b) throws ProgramException {
        if (b == 0) {
            throw new ProgramException("Ви зломаєте математику!");
        }
        return (double) a / b;
    }

}
