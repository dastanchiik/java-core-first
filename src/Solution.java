import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String[] str = {"abs", "01", "0001", "12", "512", "a12bs"};
//        System.out.println(method(str));
    }
    public static ArrayList<Integer>method(String[] str){
        ArrayList<Integer>list = new ArrayList<>();
        StringBuilder a = new StringBuilder();
        for (String s : str) {
            String[]arr = s.split("\\D+");
            Integer number = Integer.parseInt(String.join("",arr));
            list.add(number);
        }
        return list;
    }
}