package src.ch030;

public class Ternary {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // a가 b보다 큰지 확인하고, 크면 "a가 더 큽니다"를, 그렇지 않으면 "b가 더 큽니다"를 출력
        String result = (a > b) ? "a가 더 큽니다" : "b가 더 큽니다"; // if else 문을 한 줄로 표현 가능

        System.out.println(result);  // b가 더 큽니다

        // if-else로 표현..

    }
}
