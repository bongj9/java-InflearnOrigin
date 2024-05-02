package Package1.Ex.extend;

public class Movie extends Item {
    private String director;
    private String author;

    public Movie(String name, int price,String director, String author) {
        super(name, price);
        this.director = director;
        this.author = author;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("감독이름 " +
                        director+
                "배우이름" +
                    author);
    }
}
