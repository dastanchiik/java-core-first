package probely;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}