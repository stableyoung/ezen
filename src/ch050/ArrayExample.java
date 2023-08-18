package src.ch050;

public class ArrayExample {
    public static void main(String[] args) {
        // 배열 선언및 초기화
        int[] myArray = {15, 70, -30, 40, 50, 24, 25, 67, 79};   //배열갯수 변경..

        // 배열 값 출력
        for(int i = 0; i < myArray.length; i++) {
            System.out.println("Element at index" + i + ":"+myArray[i]);
        }
    }
}
