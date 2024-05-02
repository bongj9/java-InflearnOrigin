package Package1.Ex.ProductOrder;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부", 2000, 3);
        orders[1] = createOrder("콜라", 3000, 5);
        orders[2] = createOrder("과자", 6000, 4);

        printOrders(orders);
        int TotalAmount = getTotalAmount(orders);
        System.out.println(TotalAmount);
    }
    static  ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder createOrder = new ProductOrder();
        createOrder.productName = productName;
        createOrder.price = price;
        createOrder.quantity = quantity;
        return createOrder;
    }
    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName +"상품가격: " + order.price + "상품수량: " + order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders) {
        int totalPrice = 0;
        for (ProductOrder order : orders) {
            totalPrice += order.price * order.quantity;
        }
        return totalPrice;
    }

}
