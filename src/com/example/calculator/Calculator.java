package com.example.calculator;

public class Calculator {
    double result = 0.0;

    public double calculate(int num1, int num2, char calc){
        switch (calc) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = (double) num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("잘못된 연산 기호입니다.");
                break;
        }

        return result;
    }

}