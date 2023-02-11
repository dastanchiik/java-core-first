import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int n1 = 366, n2 = 60;
        int hcf = hcf(n1, n2);

        System.out.printf("G.C.D of %d and %d is %d.", n1, n2, hcf);
    }

    public static int hcf(int n1, int n2)
    {
        if (n2 != 0)
            return hcf(n2, n1 % n2);
        else
            return n1;
    }
}
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt(), sum = 0;
//        int count = 0;
//        while (count<=num) {
//            count++;
//            while (num % 2 == 1) {
//                // sum = sum + i;
//                System.out.println(num);
//                sum += num;
//            }
//        }
//        System.out.println("Sum = " + sum);
//    }