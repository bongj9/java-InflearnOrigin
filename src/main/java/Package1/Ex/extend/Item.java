package Package1.Ex.extend;

public class Item {
     String name;
     int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void print() {
        System.out.println("제목: " + name +
                "가격" + price);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
