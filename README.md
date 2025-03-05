# CalculatorProject

feat/#3 브랜치 - Lv 1 구현 <br>
feat/#5 브랜치 - Lv 2 구현 <br>
feat/#7 브랜치 - Lv 3 구현 <br><br>

### Lv 1. 클래스 없이 기본 연산 수행하는 계산기 구현 
- Scanner로 양의 정수(0 포함) 하나씩 입력
- Scanner로 사칙연산 기호 입력
- 제어문을 사용해서 연산 수행
- 반복문 실행 중 "exit" 문자열 입력 시 반복 종료

<br>
<br>

### Lv 2. Calculator 클래스와 App 클래스로 분리된 계산기 구현 
#### Calculator.java
- 매개변수로 양의 정수 2개와 연산 기호 전달 받기
- 사칙연산 수행 후 결과값 반환
- <b>컬렉션 타입 필드</b>에 연산 결과 저장
- getter/setter로 컬렉션 타입 필드에 접근
#### App.java
- Scanner로 양의 정수(0 포함) 하나씩 입력
- Scanner로 사칙연산 기호 입력
- Calculator 클래스에 입력값 전달
- 반복문 실행 중 "exit" 문자열 입력 시 반복 종료

<br>
<br>

### Lv 3. Enum, 제네릭, 람다&스트림 활용한 계산기 구현
#### Operator.java
- 연산자 타입 정보 관리
#### Calculator.java
- 연산 메서드 calculate()에 여러 타입의 매개변수 허용
#### App.java
- int, double 타입 피연산자 입력 허용
- Scanner로 값 입력받고, 저장된 연산 결과 중 입력값보다 큰 값만 출력
