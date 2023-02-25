import java.util.Random;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        method(sc);
    }
    public static void method(Scanner sc){
        Random ran = new Random();
        int a = ran.nextInt(100);
        int count = 0;
        System.out.print("Enter to number:");
        int b = sc.nextInt();
        while (b != a){
            if (b < a){
                System.out.println("your number is small");
            count++;
            b = sc.nextInt();
            } else if (b > a) {
                System.out.println("your number is big");
                count++;
                b = sc.nextInt();
            }
        }
        if (b == a){
            int w = count+1;
            System.out.println("You are win!!!\nYou are using "+w+" attempt\nright number:"+a);
        }
    }
}