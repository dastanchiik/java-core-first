import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(highAndLow("1,2,3,4,5"));
    }
    public static String highAndLow(String numbers) {
        int max = numbers.chars().max().getAsInt();
        return String.valueOf(Character.getNumericValue(max));
    }
}