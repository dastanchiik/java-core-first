import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"камень", "ножницы", "бумага"};
        boolean gameWon = false;

        System.out.println("Добро пожаловать в игру Камень-ножницы-бумага!");

        while (!gameWon) {
            System.out.print("Введите свой выбор (камень, ножницы или бумага): ");
            String playerChoice = scanner.nextLine();
            int computerChoice = random.nextInt(3);

            System.out.println("Компьютер выбрал: " + options[computerChoice]);

            if (playerChoice.equals(options[computerChoice])) {
                System.out.println("Ничья!");
            } else if (playerChoice.equals("камень") && options[computerChoice].equals("ножницы") ||
                       playerChoice.equals("ножницы") && options[computerChoice].equals("бумага") ||
                       playerChoice.equals("бумага") && options[computerChoice].equals("камень")) {
                System.out.println("Поздравляем, вы выиграли!");
                gameWon = true;
            } else {
                System.out.println("К сожалению, вы проиграли. Попробуйте еще раз.");
            }
        }

        scanner.close();
    }
}
