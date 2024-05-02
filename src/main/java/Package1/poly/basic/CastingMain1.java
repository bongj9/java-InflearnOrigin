package Package1.poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();
        //자식의 기능을 호출못한다
        Child child = (Child) poly; //다운캐스팅
        child.parentMethod();
    }
}
