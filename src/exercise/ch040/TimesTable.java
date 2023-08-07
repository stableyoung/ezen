package src.exercise.ch040;

// 구구단 출력 프로그램
public class TimesTable {
    public static void main(String[] args) {
        for(int i = 2; i <= 9; i++) {
            for(int j = 2; j <= 9; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
