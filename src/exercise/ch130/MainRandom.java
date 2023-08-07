package src.exercise.ch130;

import java.util.ArrayList;
import java.util.Random;

public class MainRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < 10; i++)
        {
            list.add(rand.nextInt(100));
        }

        for(int number : list)
        {
            System.out.println(number);
        }

    }
}
