package src.ch080;

public class MainConstructor {
    public static void main(String[] args) {
        Book book = new Book("이것이 Java Standard!!!");
        book.printInfo();

        book = new Book("이것이 Java Standard!!!", "정초영");
        book.printInfo();

        book = new Book("이것이 Java Standard!!!", "정초영", 700);
        book.printInfo();

        book = new Book(
                "이것이 Java Standard!!!",
                "정초영",
                700,
                "이것이 자바다의 내용을 상세히 설명한 책입니다."
        );
        book.printInfo();


    }
}

class Book {
    String title;
    String author;
    int pages;

    // 내용
    String detail;

    // 내용 detail 속성 추가 ..

    public Book(String title)
    {
        this.title = title;
    }
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int pages)
    {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book(String title, String author, int pages, String detail) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.detail = detail;
    }

    void printInfo() {
        System.out.println("제목: "+title);
        System.out.println("저자: "+author);
        System.out.println("페이지 수: "+pages);
        System.out.println("내용: "+detail);
    }
}
