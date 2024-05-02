package Package1.Ex.ProductOrder;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        //1
        ProductOrder pr1 = new ProductOrder(); //이것은 참조값이다.
        pr1.productName = "두부";
        pr1.price = 1000;
        pr1.quantity = 2;
        productOrders[0] = pr1;
        //2
        ProductOrder pr2
                = new ProductOrder();
        pr2.productName = "김치";
        pr2.price = 2000;
        pr2.quantity = 3;
        productOrders[1] = pr2;

        //3
        ProductOrder pr3 = new ProductOrder();
        pr3.productName = "콜라";
        pr3.price = 4000;
        pr3.quantity = 3;
        productOrders[2] = pr3;

        int totalAmount = 0;
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " + productOrder.productName + "가격: " + productOrder.price + " 수량: " + productOrder.quantity);
            totalAmount += productOrder.price;
        }
        System.out.println("총 금액은 : " + totalAmount);
    }
}
