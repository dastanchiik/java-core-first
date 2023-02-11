import java.util.Random;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random ran = new Random();
        int num = scanner.nextInt(), sum = 0;
        int count = 0 ;
        while (count != num){
            while (count %2==1){
                count++;
            }
            count++;
        }
    }
}