package com.example.service.impl;

import com.example.service.ICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements ICalculatorService {
    @Override
    public int calculate(Integer num1, Integer num2, String operator) {
        System.out.println(operator);
        switch (operator) {
            case "Addition(+)":
                return num1 + num2;
            case "Subtraction(-)":
                return num1 - num2;
            case "Multiplication(*)":
                return num1 * num2;
            case "Division(/)":
                return num1 / num2;
        }
        return 0;
    }
}
