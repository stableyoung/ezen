package src.ch140;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Memo implements Serializable {
    private String title;   // 제목
    private String content; // 내용

    private LocalDateTime createdTime;  // 생성 시간

    public Memo(String title, String content, LocalDateTime createdTime) {
        this.title = title;
        this.content = content;
        this.createdTime = createdTime;
    }

    public String toString() {
        return title;
    }

    // getter

    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }
}
