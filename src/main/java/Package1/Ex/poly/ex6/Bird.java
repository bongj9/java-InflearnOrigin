package Package1.Ex.poly.ex6;

import Package1.Ex.ex3.AbstractAnimal;

public class Bird extends AbstractAnimal implements Fly {

    @Override
    public void sound() {
        System.out.println("쨱짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
