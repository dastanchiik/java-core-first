package it.kg.Exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Elmirbek");
        list.add("Mbappe");
        list.add("Bakyt");
        list.add("Lewandovsky");
        list.add("Neymar");
        list.add("Ronaldo");
        list.add("Messi");
        method(list,"l");
    }
    public static void method(ArrayList<String> list, String a) {
        List<String> matches = list.stream().filter(it -> it.contains(a)).toList();
        ArrayList<String> array = new ArrayList<>(matches);
        System.out.println("original elements: "+list);
        for (String e:array) {
            list.remove(e);
        }
        System.out.println("elements after remove: "+list);
        System.out.println("elements remove: "+matches+"\n"+"because have letter: <<<<<<<<<  -> "+a+" <-  >>>>>>>>>");
    }
}