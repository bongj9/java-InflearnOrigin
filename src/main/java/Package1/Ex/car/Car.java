package Package1.Ex.car;

public class Car {
    private static int TotalCar;
    private String name;

    public Car(String name) {
        System.out.println("차량 구입, 이름: " + name);
        this.name = name;
        TotalCar++;
    }

    static void showTotalCars() {
        System.out.println(TotalCar);
    }
}

