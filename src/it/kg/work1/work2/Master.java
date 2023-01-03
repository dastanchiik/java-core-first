package it.kg.work1.work2;

import java.util.ArrayList;

public class Master {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("Nurbek",2));
        list.add(new User("Kerim",2));
        list.add(new User("Ermek",2));
        list.add(new User("Luffi",2));
        list.add(new User("Beka",6));
        list.add(new User("Beka",6));
        list.stream().filter(x -> x.getId()>=4).forEach(System.out::println);
        System.out.println(list.stream().filter(x -> x.getId()>=4).count()+" студентов получили хорошие оценки");
        System.out.println("\n");
        list.stream().filter(user -> user.getId()==2).forEach(System.out::println);
        System.out.println(list.stream().filter(user -> user.getId()==2).count()+" студентов получили 2");
    }
}