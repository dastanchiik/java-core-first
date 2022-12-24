import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 -> Создать задание\n" + "2 -> Удалить задание\n" + "\n" + "3 -> Отредактировать задание\n" + "\n" + "4 -> Просмотреть список ВСЕХ заданий\n" + "\n" + "5 -> Просмотреть список ВЫПОЛНЕННЫХ заданий\n" + "6 -> Просмотреть список НЕВЫПОЛНЕННЫХ заданий\n" + "7 -> Пучкты 4-6 на конкретную дату ВЫПОЛНЕНИЯ\n" + "8 -> Пучкты 4-6 на конкретную дату СОЗДАНИЯ\n" + "9 -> Просмотреть детальную информацию о задании \n10 -> закончить");
        ArrayList<Task>tasks = new ArrayList<>();
        int num = scanner.nextInt();
        while (num != 10){
            if (num == 1){
                System.out.print("Введите условие:");
                tasks.add(new Task(scanner.next()));
            } else if (num == 2) {
                System.out.println("введите какое задание хотите удалить:");
                int number = scanner.nextInt();
                number--;
                tasks.remove(number);
                System.out.println("1 -> Создать задание\n" + "2 -> Удалить задание\n" + "\n" + "3 -> Отредактировать задание\n" + "\n" + "4 -> Просмотреть список ВСЕХ заданий\n" + "\n" + "5 -> Просмотреть список ВЫПОЛНЕННЫХ заданий\n" + "6 -> Просмотреть список НЕВЫПОЛНЕННЫХ заданий\n" + "7 -> Пучкты 4-6 на конкретную дату ВЫПОЛНЕНИЯ\n" + "8 -> Пучкты 4-6 на конкретную дату СОЗДАНИЯ\n" + "9 -> Просмотреть детальную информацию о задании \n10 -> закончить");
                num = scanner.nextInt();
            }
        }
    }
    public static void metodice(){

    }
}