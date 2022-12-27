import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        ArrayList<User>users = new ArrayList<>();
        users.add(new User("c",12));
        users.add(new User("b",1432));
        users.add(new User("a",1));
        Collections.sort(users);
        for (User e:users) {
            System.out.println(e);
        }
    }
}