package src.ch040;

import java.util.ArrayList;

public class ForEachExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Good");
        list.add("Morning");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
