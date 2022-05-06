package com.example.service.impl;

import com.example.service.ICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements ICalculatorService {
    @Override
    public String calculate(Integer num1, Integer num2, String operator) {
        System.out.println(operator);
        String result = null;
        switch (operator) {
            case "Addition(+)":
                result = String.valueOf(num1 + num2);
                break;
            case "Subtraction(-)":
                result = String.valueOf(num1 - num2);
                break;
            case "Multiplication(*)":
                result = String.valueOf(num1 * num2);
                break;
            case "Division(/)":
                try {
                    result = String.valueOf(num1 / num2);

                } catch (Exception e) {
                    result = "Cant divisise a number to 0";
                }
                break;

        }
        return result;
    }

}
