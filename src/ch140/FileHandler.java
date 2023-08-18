package src.ch140;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class FileHandler {

    public void saveMemos(List<Memo> memos)
    {
        try {
            FileOutputStream fos = new FileOutputStream("memo.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(memos);
            oos.close();
            fos.close();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public List<Memo> loadMemos()
    {
        List<Memo> memos = null;
        try {
            FileInputStream fis = new FileInputStream("memo.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            memos = (List<Memo>)ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException ex)
        {
            ex.printStackTrace();
        } catch (ClassNotFoundException c)
        {
            System.out.println("Class Not Found");
            c.printStackTrace();
            return new ArrayList<>();
        }

        return memos;
    }
}
