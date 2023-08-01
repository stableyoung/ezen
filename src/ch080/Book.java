package src.ch080;

public class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    void printInfo() {
        System.out.println("제목: "+title);
        System.out.println("저자: "+author);
        System.out.println("페이지 수: "+pages);
    }
}
