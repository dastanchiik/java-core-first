package olymp;
import java.util.Scanner;

public class Solution {
    static final int MOD = 1000000007;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = n; i <= 2 * n; i++) {
            sum = (sum + getLargestOddDivisor(i)) % MOD;
        }
        System.out.println(sum);
//        scanner.close();
    }

    public static int getLargestOddDivisor(int n) {
        if (n % 2 == 0) {
            n = n / 2;
        }
        while (n % 2 == 0) {
            n = n / 2;
        }
        return n;
    }

}