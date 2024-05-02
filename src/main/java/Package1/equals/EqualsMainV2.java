package Package1.equals;

public class EqualsMainV2 {

    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");
        // 그냥 ==은 인스턴스의 값을 비교하는 것
        System.out.println(user1.equals(user2));
    }
}
