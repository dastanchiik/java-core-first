package it.kg.work1;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[]arr = {123,1234};
        method(arr);
    }
    public static void method(int[] arr){

        Arrays.stream(arr).mapToDouble((x)->(double)x*0.1).forEach(System.out::println);
    }
}