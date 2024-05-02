package Package1.equals;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
         UserV2 user = (UserV2) obj;
         return id.equals(user.id);
    }
}
