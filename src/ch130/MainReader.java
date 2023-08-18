package src.ch130;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainReader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
