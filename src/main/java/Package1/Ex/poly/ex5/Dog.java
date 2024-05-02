package Package1.Ex.poly.ex5;

public class Dog implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("머엉");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
