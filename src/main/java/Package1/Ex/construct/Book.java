package Package1.Ex.construct;

public class Book {
    String title; //제목
    String author; //저자
    int page; //페이지 수

    //TODO 코드를 완성하세요.
    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }
    //매개변수를 제목과 저자만 받는 생성자
    Book(String title, String author) {
        this(title, author, 0);
    }
    //기본생성자
    Book() {
        this("", "", 0);
    }

    void displayInfo() {
        System.out.println("제목: " + title+ ", 저자: " +author+", 페이지: "+ page);
    }
}
