import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long m = scan.nextInt();
        long n = scan.nextInt();
        long k = scan.nextInt();

        if (m % k == 0) {
            System.out.println(0);
            return;
        }

        long residue = 0;
        if (2 <= m && m <= 2023 &&
        1 <= n && n <= 2023 &&
        5 <= k && k <= 2023) {

            residue = ((long) Math.pow(m, n) / 2) * ((long) Math.pow(m, 2) + 23) % k;
        }
        System.out.println(Math.max(residue, 0));
    }
}