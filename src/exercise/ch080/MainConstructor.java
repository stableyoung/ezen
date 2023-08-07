package src.exercise.ch080;

public class MainConstructor {
    public static void main(String[] args) {
        Book book = new Book("이것이 Java Standard!!!", "정초영", 700);
        book.printInfo();
    }
}

class Book {
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
