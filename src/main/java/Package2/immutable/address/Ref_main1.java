package Package2.immutable.address;

public class Ref_main1 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; //단순하게 참조한 것

        //불변객체임으로 set으로 값을 못바꿈
        //객체를 다시 생성해야한다.
        b = new ImmutableAddress("부산");
        System.out.println("a.address ==" + a);
        System.out.println("b.address ==" + b);
    }
}
