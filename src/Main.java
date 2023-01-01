
public class Main {
    public static void main(String[] args) {
        method(new Object[]{3,4,7,9,8,87,67});
    }
    public static <T> void method(T[] a){
        for (T e:a) {
            System.out.println(e);
        }
    }
}