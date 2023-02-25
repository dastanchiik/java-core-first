import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = {{' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}};
        char currentPlayer = 'X';
        boolean gameWon = false;

        System.out.println("Добро пожаловать в игру Крестики-нолики!");

        while (!gameWon) {
            // Отрисовываем игровое поле
            System.out.println("-------------");
            for (int i = 0; i < 3; i++) {
                System.out.print("| ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " | ");
                }
                System.out.println();
                System.out.println("-------------");
            }

            // Ход игрока
            System.out.println("Ходит игрок " + currentPlayer);
            System.out.print("Введите номер строки: ");
            int row = scanner.nextInt() - 1;
            System.out.print("Введите номер столбца: ");
            int col = scanner.nextInt() - 1;

            // Проверяем корректность введенных координат
            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Неверные координаты, попробуйте еще раз.");
            } else if (board[row][col] != ' ') {
                System.out.println("Эта ячейка уже занята, попробуйте еще раз.");
            } else {
                board[row][col] = currentPlayer;

                // Проверяем, выиграл ли игрок
                gameWon = (board[0][0] == currentPlayer && board[0][1] == currentPlayer && board[0][2] == currentPlayer) ||
                          (board[1][0] == currentPlayer && board[1][1] == currentPlayer && board[1][2] == currentPlayer) ||
                          (board[2][0] == currentPlayer && board[2][1] == currentPlayer && board[2][2] == currentPlayer) ||
                          (board[0][0] == currentPlayer && board[1][0] == currentPlayer && board[2][0] == currentPlayer) ||
                          (board[0][1] == currentPlayer && board[1][1] == currentPlayer && board[2][1] == currentPlayer) ||
                          (board[0][2] == currentPlayer && board[1][2] == currentPlayer && board[2][2] == currentPlayer) ||
                          (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                          (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);

                // Переключаем игрока
                if (!gameWon) {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            }
        }

        System.out.println("Игра окончена! Игрок " + currentPlayer + " победил!");
        scanner.close();
    }
}
