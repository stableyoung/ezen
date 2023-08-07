package src.exercise.ch050;

public class ArrayExample {
    public static void main(String[] args) {
        // 배열 선언및 초기화
        int[] myArray = {10, 20, 30, 40, 50};

        // 배열 값 출력
        for(int i = 0; i < myArray.length; i++) {
            System.out.println("Element at index" + i + ":"+myArray[i]);
        }
    }
}
