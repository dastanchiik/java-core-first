import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String a = scanner.next();
            char[]array = a.toCharArray();
            for (int i = 0; i < array.length; i++) {
                String value = String.valueOf(array[i]);
                String value1 = String.valueOf(array[i]);
                if (i%2==1){
                    System.out.print(value1.toLowerCase());
            }
               if (i%2==0) {
                    System.out.print(value.toUpperCase());
                }
        }
    }
}