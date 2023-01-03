package leetcode;

import java.util.*;

public class SearchArray {
    public static void main(String[] args) {
    int[]arr = {1,2,9};
        plusOne(arr);
    }
    public static int[] plusOne(int[] digits) {
        StringBuilder str = new StringBuilder();
        for (int digit : digits) {
            str.append(digit);
        }
        int a = Integer.parseInt(String.valueOf(str));
        int arr = a+1;
//        int arr = Integer.MAX_VALUE;
        StringBuilder s = new StringBuilder();
        System.out.println(arr);
        while(arr>0) {
            s.insert(0, arr%10);
            arr = arr / 10;
        }
        System.out.println(s+" ");

//     LinkedList<Integer>list = new LinkedList<>();
//     int[] a = {1,2,9};
//     int e = 0;
//        int q = digits.length-1;
//        digits[q]++;
//
//        for (Integer r:digits) {
//        list.add(r);
//        }
//        if (list.getLast()>9){
//           int index = list.indexOf(list.getLast());
//           int notIndex = list.indexOf(list.getLast());
//            list.set(index,0);
//            int z = list.get(notIndex);
//            z++;
//            list.set(notIndex,z);
//            notIndex++;
//        }
//        list.forEach(System.out::println);
        return null;
/**        return list;
   */ }
}
