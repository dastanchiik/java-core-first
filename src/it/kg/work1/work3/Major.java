package it.kg.work1.work3;

import java.util.ArrayList;
import java.util.List;

public class Major {
    public static void main(String[] args) {
    method();
    }
    public static void method(){
    List<Olya> list = new ArrayList<>();
    list.add(new Olya("Юля"));
    list.add(new Olya("Юлия"));
    list.stream().map(x -> x.getName()+x.getName()).forEach(System.out::println);
    }
}