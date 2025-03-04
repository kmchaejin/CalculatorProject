package com.example.calculator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 첫 번째 값 입력
            System.out.println("숫자를 입력해주세요.");
            String firstInput = scanner.next();

            int num1 = 0;

            // 입력값이 exit면 종료
            if (firstInput.equals("exit")) {
                System.out.println("프로그램이 종료됩니다.");
                break;
            } else {
                try {
                    // 문자열을 정수로 변환
                    num1 = Integer.parseInt(firstInput);
                } catch (NumberFormatException e) {
                    // exit 외의 문자열을 입력한 경우 재입력
                    System.out.println("exit 또는 양의 정수만 입력해주세요.");
                    continue;
                }
            }

            // 두 번째 정수와 연산 기호 입력
            int num2 = scanner.nextInt();
            System.out.println("연산 기호를 입력해주세요.");
            char calc = scanner.next().charAt(0);

            double result = 0.0;

            // 입력값이 음수이면 재입력
            if (num1 < 0 || num2 < 0) {
                System.out.println("양의 정수를 입력해주세요.");
            }

            // 계산기 객체 생성
            Calculator calculator = new Calculator();
            result = calculator.calculate(num1, num2, calc);
            System.out.println(num1 + " " + calc + " " + num2 + " " + "=" + " " + result + "\n");
        }
    }
}

