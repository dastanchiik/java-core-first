package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class SearchArray {
    public static void main(String[] args) {
    int[]arr = {987654320};
        System.out.print(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for (int digit : digits) {
            str.append(digit);
        }
        int a = Integer.parseInt(String.valueOf(str));
        int arr = a + 1;

        char[] chars = String.valueOf(arr).toCharArray();
        for (char aChar : chars) {
            list.add(Integer.parseInt(String.valueOf(aChar)));
        }
        int[] bgkrmgr = new int[list.size()];
        for (int i = 0; i < bgkrmgr.length; i++) {
            bgkrmgr[i] = list.get(i);
        }
        return bgkrmgr;
    }
}
