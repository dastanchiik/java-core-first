package it.kg.Exam;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("Adilet");
        list.add("Beka");
        method(list,"k");

    }
    public static void method(ArrayList<String>lists, String word){
       List<String>list = lists.stream().filter(x -> x.contains(word)).toList();
        System.out.println(list);
    }
}