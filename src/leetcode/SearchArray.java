package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchArray {
    public static void main(String[] args) {
    int[]arr = {1,2,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for (int digit : digits) {
            str.append(digit);
        }
        int a = Integer.parseInt(String.valueOf(str));
        int arr = a + 1;

        //        ArrayList<Integer> result = new ArrayList<>();
//        while(arr > 0){
//            result.add(arr%10);
//            arr = arr/10;
//        }
//        Collections.reverse(result);
//        int e = Integer.parseInt(String.valueOf(result));
      return new int[]{e};
    }
}
