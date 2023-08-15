package src.ch050;


// 최대 최소 구하기
public class MaxMin {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  // 배열갯수, 값 변경..
        int min = array[0];
        int max = array[0];

        for(int i = 1; i < array.length; i++) {
            if(array[i] < min) min = array[i];
            if(array[i] > max) max = array[i];
        }

        System.out.println("Min: " + min + ", Max: " + max);
    }
}