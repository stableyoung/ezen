package src.ch140;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    public void saveMemos(List<Memo> memos) {
        try {
            FileOutputStream fos = new FileOutputStream("memos.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(memos);
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public List<Memo> loadMemos() {
        List<Memo> memos = null;
        try {
            FileInputStream fis = new FileInputStream("memos.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            memos = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return new ArrayList<>();
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return new ArrayList<>();
        }
        return memos;
    }
}
