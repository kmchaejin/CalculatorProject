package com.example.calculator;

public enum Operator {
    ADD('+'), SUBTRACT('-'), MULTIPLY('*'), DIVIDE('/'), MODULUS('%');

    private final char operator;

    Operator(char operator) {
        this.operator = operator;
    }

    public static Operator getOperator(char operator){
        for(Operator op:values()){
            if(op.equals(operator)){
                return op;
            }
        }
        throw new IllegalArgumentException("Invalid operator: " + operator);
    }
}
