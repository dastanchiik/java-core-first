import java.util.Scanner;

public class Game2 {
    public static void main(String[] args) {
        maximka();
    }
    public static void maximka() {
        String w="телеграмма";
        System.out.println("Ваше слово состоит из 10 букв");
        System.out.println("*********");
        for (int j=0;j<15;j++) {                        //Уважаемый програмист
            Scanner scan = new Scanner(System.in);      //На код потрачено 5+1 часа
            System.out.print("\nВведите букву: ");      //И много(очень много) нервов
            char a = scan.next().charAt(0);
            char[] b = w.toCharArray();
            for (int i = 0; i < b.length; i++) {
                if (b[i] == a) {
                    b[i] = a;
                }
                if (b[i] != a) {
                    b[i] = '*';
                }
            }
            System.out.println(b);
            /*char[] c =new  char[10];
            for (char i=0;i<c.length;i++){
                if(c[i]==b[i]){
                    b[i]+=c[i];
                }
            }
           System.out.print(c);
           */
        }
    }
}