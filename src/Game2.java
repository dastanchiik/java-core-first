import java.util.ArrayList;
import java.util.Scanner;

public class Game2 {
    private static ArrayList<Character> userChars = new ArrayList<>();
    private static String word = "spun";
    private static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < word.length(); i++) {
            System.out.print("_");
        }
        System.out.println();
        String tmpAnswer = "";
        while (!word.equals(tmpAnswer)) {
            tmpAnswer = getAnswerString(scanner.next());
            System.out.println(tmpAnswer);
        }
    }

    private static String getAnswerString(String userInputChars) {
        answer.delete(0, answer.length());
        if (word.contains(userInputChars))
            userChars.add(userInputChars.charAt(0));
        for (char wordsChar : word.toLowerCase().toCharArray()) {
            if (userChars.contains(wordsChar))
                answer.append(wordsChar);
            else answer.append('_');
        }
        return answer.toString();
    }
}