package src.ch140;

import java.time.LocalDateTime;

public class Memo implements java.io.Serializable{
    private String title;
    private String content;
    private LocalDateTime createdDate;

    public Memo(String title, String content, LocalDateTime createdDate) {
        this.title = title;
        this.content = content;
        this.createdDate = createdDate;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }
}
