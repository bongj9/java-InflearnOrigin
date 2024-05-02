package Package1.access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        data.publicField = 1;
        data.publicMethod();

        data.defaultField = 2;
        data.DefaultMethod();

        data.innerAccess();
        //내부로 접근할수있으므로 다 접근할수있다
    }
}
