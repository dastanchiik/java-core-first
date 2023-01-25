import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 6, 7, 8};
        int[] array = {1, 2, 3, 3, 4, 5, 6, 7, 8};

        System.out.println(isSameTree(arr, array));
    }

    public static boolean isSameTree(int[] p, int[] q) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list.add(1);
        list1.add(1);
        if (list1.equals(list)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        return Arrays.equals(p, q);
    }
}
