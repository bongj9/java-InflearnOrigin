package Package1.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        //== 은 참조의 비교값

        System.out.println("identity = " +
                (user1 == user2));
        System.out.println("equals = " +
                (user1.equals(user2)));
    }

}
