import java.util.Scanner;

public class Game2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Hello";
        char a = scanner.next().charAt(0);

            printCharsInWord(str, a);
            a = scanner.next().charAt(0);
    }

    private static void printCharsInWord(String word, char userChar) {
        while (true) {
            for (char wordsChar : word.toCharArray()) {
                if (wordsChar == userChar) {
                    System.out.print(wordsChar);
                } else {
                    System.out.print('_');
                }
            }
        }
    }
}
