package newpackage;

import javax.swing.*;
import java.util.Scanner;

public class NewMain extends JFrame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    Circle circle = new Circle();
    circle.area(scanner.nextDouble());
    }
}