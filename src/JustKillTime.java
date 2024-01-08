import java.util.Scanner;

public class JustKillTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
        int a = scanner.nextInt();
        String b = String.valueOf(a);
        StringBuilder str = new StringBuilder();
        int q = b.length()-1;
        int d = b.length()-q;
        if (b.charAt(0) == '-'){
            str.append(b.substring(d));
            str.reverse();
            System.out.println("-"+str);
        }else {
            str.append(b);
        str.reverse();
            System.out.println(str);
        }
        }


    }
}
