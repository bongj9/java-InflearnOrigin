package Package1.construct;

public class MemberContruct {
    String name;
    int age;
    int grade;
    //추가
/*    MemberContruct(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 50;
    }*/
    MemberContruct(String name, int age) {
        this(name, age, 50); //생성자를 만들어서 넘긴
    }
    MemberContruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ",age = " + age + ",grade= " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
