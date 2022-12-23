import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    method();
    }
    public static void method(){
        ArrayList<Integer>arr = new ArrayList<>();
       Scanner scanner = new Scanner(System.in);
        System.out.println();
       int[]array = {1,2,3,4,5,6};
        for (int i = 1; i <= array.length; i++) {
            System.out.print(i+" ");
        }
        System.out.println("\n");
        System.out.println("max number:"+Arrays.stream(array).max());
    }
}
