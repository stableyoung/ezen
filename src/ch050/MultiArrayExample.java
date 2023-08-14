package src.ch050;

public class MultiArrayExample {
    public static void main(String[] args) {
        // 다차원 배열 선언및 초기화
        int[][] my2DArray = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};

        // 다차원 배열 값 출력
        for(int i = 0; i < my2DArray.length ; i++) {
            for(int j = 0; j < my2DArray[i].length; j++) {
                System.out.println("Element at ["+i+"]["+j+"]:"+ my2DArray[i][j]);
            }
        }
    }
}
