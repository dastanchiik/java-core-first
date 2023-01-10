package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class SearchArray {
    public static void main(String[] args) {
    char[]arr = {'h','e','l','l','l','o'};
        reverseString(arr);
    }
        public static void  reverseString(char[] s) {
         String s1 = String.valueOf(new StringBuilder(String.valueOf(s)).reverse());
         char[] chars = s1.toCharArray();
            System.out.print("[");
            for (char f:chars ) {
                System.out.print("'"+f+"'");
            }
            System.out.print("]");
        }
    }