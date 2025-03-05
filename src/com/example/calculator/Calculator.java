package com.example.calculator;

import java.util.List;
import java.util.ArrayList;

public class Calculator<T extends Number> {
    double result;
    double num1;
    double num2;
    char operator;
    private List<Double> resultList = new ArrayList<>();

    public void setNum1(T num1){
        this.num1 = num1.doubleValue();
    }

    public void setNum2(T num2){
        this.num2 = num2.doubleValue();
    }

    public void setSymbol(char operator){
        this.operator = operator;
    }

    public void calculate(){
        switch (operator) {
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
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("잘못된 연산 기호입니다.");
                break;
        }

        resultList.add(result);
    }
    public Double getLastestResult(){
        return resultList.get(resultList.size()-1);
    }

    public void removeFirstData(){
        resultList.remove(0);
    }

    public List<Double> getResult(){
        return resultList;
    }

    public void setResult(T num){
        resultList.set(0, num.doubleValue());
    }
}