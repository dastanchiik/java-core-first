import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String a = scanner.next();
            int count = 0;
            while (count < a.length()) {
                System.out.println(a.substring(count));
                count++;
            }
        }
    }
}
