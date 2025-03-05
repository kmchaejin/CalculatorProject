package com.example.calculator;

import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        // 스캐너 객체, 계산기 객체 생성
        Scanner scanner = new Scanner(System.in);
        Calculator<Double> calculator = new Calculator<>();

        while (true) {
            String firstInput;
            String secondInput;
            char operator;
            double doubleNum;
            int intNum;

            // 첫 번째 값 입력
            System.out.println("첫 번째 숫자를 입력해주세요. (exit 입력 시 종료됩니다)");
            firstInput = scanner.next();

            // 입력값이 exit면 종료
            if (firstInput.equals("exit")) {
                System.out.println("프로그램이 종료됩니다.");
                break;
            } else {
                try {
                    // 입력한 숫자의 타입을 실수로 변환
                    if (firstInput.contains(".")) {
                        doubleNum = Double.parseDouble(firstInput);
                        calculator.setNum1(doubleNum);
                    } else {
                        // 입력한 숫자의 타입을 정수로 변환
                        intNum = Integer.parseInt(firstInput);
                        calculator.setNum1(intNum);
                    }
                } catch (NumberFormatException e) {
                    // exit 외의 문자열을 입력한 경우 재입력
                    System.out.println("exit 또는 숫자만 입력해주세요.");
                    continue;
                }
            }

            // 두 번째 값 입력
            System.out.println("두 번째 숫자를 입력해주세요. (exit 입력 시 종료됩니다)");
            secondInput = scanner.next();

            if (secondInput.equals("exit")) {
                System.out.println("프로그램이 종료됩니다.");
                break;
            } else {
                try {
                    // 입력한 숫자의 타입을 실수로 변환
                    if (secondInput.contains(".")) {
                        doubleNum = Double.parseDouble(secondInput);
                        calculator.setNum2(doubleNum);
                    } else {
                        // 입력한 숫자의 타입을 정수로 변환
                        intNum = Integer.parseInt(secondInput);
                        calculator.setNum2(intNum);
                    }
                } catch (NumberFormatException e) {
                    // exit 외의 문자열을 입력한 경우 재입력
                    System.out.println("exit 또는 숫자만 입력해주세요.");
                    continue;
                }
            }

            // 연산 기호 입력
            System.out.println("연산 기호를 입력해주세요.");
            operator = scanner.next().charAt(0);
            calculator.setOperator(operator);

            // 연산 실행
            calculator.calculate();
            System.out.println(firstInput + " " + operator + " " + secondInput + " = " + calculator.getLastResult() + "\n");
        }

        // 연산 결과 리스트 출력
        System.out.println(calculator.getResult());

        // 연산 결과 리스트의 첫 번째 값을 0으로 수정
        calculator.setResult(0);
        System.out.println(calculator.getResult());

        // 연산 결과 리스트의 첫 번째 값 삭제
        calculator.removeFirstData();
        System.out.println(calculator.getResult());

        // 정수 입력
        System.out.println("정수 하나를 입력해주세요.");
        double n = scanner.nextInt();

        // 입력한 수보다 큰 연산 결과만 출력
        System.out.println(
                calculator.getResult().stream()
                        .filter(num -> num > n)
                        .collect(Collectors.toList())
        );

        scanner.close();
    }
}

