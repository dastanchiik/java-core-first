import java.util.LinkedList;
import java.util.Scanner;

public class Game2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Hello";
        char a = scanner.next().charAt(0);
//        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            printCharsInWord(str, a);
            a = scanner.next().charAt(0);
        }

    }

    private static void printCharsInWord(String word, char userChar) {
        LinkedList<String> linkedList = new LinkedList<>();
        StringBuilder string = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder();
            for (char wordsChar : word.toCharArray()) {
                if (wordsChar == userChar) {
                    stringBuilder.append(wordsChar);
                } else {
                    stringBuilder.append("_");
            }
        }
            linkedList.add(String.valueOf(stringBuilder));
            linkedList.set(linkedList.indexOf(linkedList.getLast()), String.valueOf(stringBuilder));
        System.out.println(linkedList);

    }
}