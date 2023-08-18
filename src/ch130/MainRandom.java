package src.ch130;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

public class MainRandom {
    public static void main(String[] args) {
        // Random rand = new Random();    // 보안에 취약함
        SecureRandom rand = new SecureRandom(); // 실무에 사용중

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < 10; i++)
        {
        list.add(rand.nextInt(100));    // 0 ~ 99
        }

        for(int number : list)
        {
            System.out.println(number);
        }

    }
}
