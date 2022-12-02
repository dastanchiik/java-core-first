package probely;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]+" ");
        }
    }
}