package com.example.calculator;

import java.util.List;
import java.util.ArrayList;

public class Calculator<T extends Number> {
    double num1;
    double num2;
    Operator operator;
    double result;
    private List<Double> resultList = new ArrayList<>();

    public void setNum1(Number num1){
        this.num1 = num1.doubleValue();
    }

    public void setNum2(Number num2){
        this.num2 = num2.doubleValue();
    }

    public void setOperator(Operator operator){
        this.operator = operator;
    }

    public void calculate(){
        switch (operator) {
            case ADD:
                result = num1 + num2;
                break;
            case SUBTRACT:
                result = num1 - num2;
                break;
            case MULTIPLY:
                result = num1 * num2;
                break;
            case DIVIDE:
                result = num1 / num2;
                break;
            case MODULUS:
                result = num1 % num2;
                break;
        }

        resultList.add(result);
    }

    public List<Double> getResult(){
        return resultList;
    }

    public Double getLastResult(){
        return resultList.get(resultList.size()-1);
    }

    public void setResult(Number num){
        resultList.set(0, num.doubleValue());
    }

    public void removeFirstData(){
        resultList.remove(0);
    }
}