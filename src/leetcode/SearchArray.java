package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {

        method();
    }
    public static int method(){
        Scanner scanner = new Scanner(System.in);
       List<Integer>list = new ArrayList<>();
        int[]arr = {1,2,3,4,5};
        for (Integer e:arr) {
            list.add(e);
        }
        int a = scanner.nextInt();
//        System.out.println(list.indexOf(a));
        return list.indexOf(a);
    }
}
