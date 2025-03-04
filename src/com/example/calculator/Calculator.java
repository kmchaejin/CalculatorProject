package com.example.calculator;

import java.util.List;
import java.util.ArrayList;

public class Calculator {
    double result = 0.0;
    private List<Double> resultList = new ArrayList<>();

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

        resultList.add(result);
        return result;
    }

    public void removeFirstData(){
        resultList.remove(0);
    }

    public List<Double> getResult(){
        return resultList;
    }

    public void setResult(double num){
        resultList.set(0, num);
    }
}