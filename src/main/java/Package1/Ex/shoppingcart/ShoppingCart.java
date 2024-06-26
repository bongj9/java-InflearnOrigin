package Package1.Ex.shoppingcart;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
        }
        items[itemCount] = item;
        itemCount++;


    }

    public void displayItems() {
        System.out.println("장바구니 출력");
        for (Item i: items) {
            System.out.println("상품명:" + i.getName() + "합계: " + i.getTotalPrice());
        }
        System.out.println("전체가격합: " + calculateTotalPrice()
            );
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
