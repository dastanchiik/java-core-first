import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);


        System.out.println("enter bus code");
     int index = scanner.nextInt();
     while (index<0 || index>3){
         System.err.println("no such bus");
         index = scanner.nextInt();
     }
    }
}
