import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game2 {
    private static ArrayList<Character> userChars = new ArrayList<>();
    static String[] words = {
            "apple", "banana", "orange", "pear", "grape", "kiwi", "watermelon", "pineapple",
            "strawberry", "blueberry", "raspberry", "mango", "peach", "apricot", "plum", "cherry",
            "lemon", "lime", "coconut", "papaya", "fig", "pomegranate", "guava", "grapefruit",
            "cantaloupe", "honeydew", "avocado", "dragonfruit", "starfruit", "passionfruit",
            "lychee", "persimmon", "melon", "tangerine", "clementine", "mandarin", "kumquat",
            "boysenberry", "blackberry", "loganberry", "gooseberry", "currant", "cranberry",
            "elderberry", "mulberry", "cherry", "pepper", "onion", "garlic", "ginger", "carrot",
            "celery", "cucumber", "tomato", "potato", "sweet potato", "yam", "broccoli", "cauliflower",
            "spinach", "lettuce", "cabbage", "kale", "asparagus", "eggplant", "zucchini", "squash",
            "bell pepper", "corn", "peas", "beans", "lentils", "chickpeas", "tofu", "tempeh", "seitan",
            "quinoa", "rice", "pasta", "bread", "bagel", "croissant", "muffin", "pancake", "waffle",
            "oatmeal", "cereal", "granola", "yogurt", "cheese", "milk", "cream", "butter", "oil", "salt",
            "pepper", "sugar", "honey", "jam", "mustard", "ketchup", "mayonnaise", "vinegar", "soy sauce",
            "hot sauce", "salsa", "guacamole", "humus", "pesto", "gravy", "sour cream", "ranch dressing"
    };

    private static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) {
        Random random = new Random();
        String word = words[random.nextInt(1,100)];
        List<String> firstUser = new ArrayList<>();
        List<String> secondUser = new ArrayList<>();
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < word.length(); i++) {
            System.out.print("_");
        }
        System.out.print("attempt first user:");
        String string = scanner.next();
        System.out.println();
        String tmpAnswer = "";
        while (!word.equals(tmpAnswer)) {
            tmpAnswer = getAnswerString(scanner.next(),word);
            System.out.println(tmpAnswer);
        }
    }

    private static String getAnswerString(String firstUser,String word) {
        answer.delete(0, answer.length());
        if (word.contains(firstUser))
        if (word.contains(firstUser)) userChars.add(firstUser.charAt(0));
        for (char wordsChar : word.toLowerCase().toCharArray()) {
            if (userChars.contains(wordsChar)) answer.append(wordsChar);
            else answer.append('_');
        }
        return answer.toString();
    }
}