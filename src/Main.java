import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     String name = scanner.next();
     int a = name.length();
     int count = 0;
     while (count != a){
         System.out.println(name.substring(count));
         count++;
     }
    }
}
