import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        String[] str = {"abs", "01", "0001", "12", "512", "a12bs"};
        StringBuilder s = new StringBuilder();
        for(int a=Integer.MAX_VALUE; a>0; a/=10)
            s.insert(0, a%10);
        System.out.println(s);

//        System.out.println(method(str));
//    }
//    public static ArrayList<Integer>method(String[] str){
//        ArrayList<Integer>list = new ArrayList<>();
//        StringBuilder a = new StringBuilder();
//        for (String s : str) {
//            a.append(s);
//        }
//        String s1 = String.valueOf(a);
//        int w = s1.length();
//        String q = s1.substring(w / 2);
//        String e = s1.substring(0, w / 2);
//        String[] s2_array = q.split("\\D+");
//        String[] s1_array = e.split("\\D+");
//        Integer numbers = Integer.parseInt(String.join("", s2_array));
//        Integer number = Integer.parseInt(String.join("", s1_array));
//        StringBuilder s = new StringBuilder();
//        s.append(number);
//        s.append(numbers);
//        list.add(Integer.parseInt(String.valueOf(s)));
//        return list;
    }
}