package Package1.Ex.poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();
    }
}
