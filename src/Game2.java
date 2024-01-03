import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game2 {
private static ArrayList<Character> userChars = new ArrayList<>();

    static String[] words = {
            "ogon", "kniga", "cvetok", "solnce", "mashina",
            "musica", "komputer", "drujba", "zvezda", "voda",
            "puteshestvie", "smeh", "chasy", "lubov", "fotografia",
            "iazyk", "sport", "snovidenie", "sekret", "ulybka"
    };

    static String[] explanations = {
            "Светящаяся и теплая энергия.", "Объект с информацией и рассказами.",
            "Растение, красивоцветущее.", "Небесное тело, излучает свет и тепло.",
            "Транспортное средство.", "Искусство из звуков и ритмов.",
            "Электронное устройство для обработки данных.", "Теплые отношения между людьми.",
            "Светило в небесах.", "Жидкость, необходимая для жизни.",
            "Приключение и перемещение.", "Звук в ответ на радость или юмор.",
            "Устройство для измерения времени.", "Глубокое чувство привязанности и заботы.",
            "Изображение, зафиксированное камерой.", "Средство общения.",
            "Физическая активность, часто соревновательная.", "Состояние сознания во сне.",
            "Информация, известная только некоторым.", "Выражение лица, придающее положительное настроение."
    };
    private static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) {
        Random random = new Random();
        int r = random.nextInt(words.length);
        System.out.println(explanations[r]);
        String word = words[r];
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < word.length(); i++) {
            System.out.print("_");
        }
        System.out.println();
        String tmpAnswer = "";
        while (!word.equals(tmpAnswer)) {
            tmpAnswer = getAnswerString(scanner.next(),word);
            System.out.println(tmpAnswer);
        }
    }

    private static String getAnswerString(String userInputChars,String word) {
        answer.delete(0, answer.length());
        if (word.contains(userInputChars)) userChars.add(userInputChars.charAt(0));
        for (char wordsChar : word.toLowerCase().toCharArray()) {
            if (userChars.contains(wordsChar)) answer.append(wordsChar);
            else answer.append('_');
        }
        return answer.toString();
    }
}