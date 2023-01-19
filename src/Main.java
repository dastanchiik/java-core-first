import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
     Scanner scanner = new Scanner(System.in);
     String name = scanner.next();
     int a = name.length();
     int count = 0;
     while (count != a){
         TimeUnit.MILLISECONDS.sleep(500);
         System.out.println(name.substring(count));
         count++;
     }
    }
}
