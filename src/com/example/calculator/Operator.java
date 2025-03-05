package com.example.calculator;

enum Operator {
    // 각 객체(ADD, SUBTRACT,...)에 대한 생성자
    ADD('+'), SUBTRACT('-'), MULTIPLY('*'), DIVIDE('/'), MODULUS('%');

    char operator;

    Operator(char operator) {
        this.operator = operator;
    }

    public char getOperator(){
        return operator;
    }

    // input: 사용자가 입력한 연산 기호
    // output : enum or null
    public static Operator getOperatorEnum(char operator){
        for(Operator op : values()) {
            if(op.getOperator() == operator){
                return op;
            }
        }
        return null;
    }
}
