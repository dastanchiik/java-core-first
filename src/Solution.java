import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), sum = 0;
        int count = 0;
        while (count<=num) {
            count++;
            while (num % 2 == 1) {
                // sum = sum + i;
                System.out.println(num);
                sum += num;
            }
        }
        System.out.println("Sum = " + sum);
    }
}