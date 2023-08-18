package src.ch140;

import java.util.ArrayList;
import java.util.List;
public class MemoPad {
    private List<Memo> memos;

    public MemoPad() {
        this.memos = new ArrayList<>();
    }

    public void addMemo(Memo memo) {
        memos.add(memo);
    }

    public Memo getMemo(String title) {
        for( Memo memo: memos ) {
            if( memo.getTitle().equals(title) ) {
                return memo;
            }
        }
        return null;
    }

    public void deleteMemo(String title) {
        for( Memo memo: memos ) {
            if( memo.getTitle().equals(title) ) {
                memos.remove(memo);
                return;
            }
        }
    }

    public List<Memo> getMemos() {
        return memos;
    }
}
