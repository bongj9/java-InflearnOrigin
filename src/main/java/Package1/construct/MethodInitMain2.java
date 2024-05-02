package Package1.construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        Memberinit member1 = new Memberinit();
        member1.initMember2("user1", 15, 85);

        Memberinit member2 = new Memberinit();
        member2.initMember2("user2", 16, 80);

        Memberinit[] members = {member1, member2};
        for (Memberinit s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" +
                    s.grade);
        }
    }
}