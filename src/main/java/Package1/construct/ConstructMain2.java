package Package1.construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberContruct member1 = new MemberContruct("user1", 15, 20); //commandP 파라미터 정보확인
        MemberContruct member2 = new MemberContruct("user2", 20);

        MemberContruct[] members = {member1, member2};

        for (MemberContruct member : members) {
            System.out.println(member.name + member.age + member.grade);
        }

    }
}
