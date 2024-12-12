package MyPackage;

import java.util.Scanner;

public class SequenceTasks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 1: Треугольная последовательность
        System.out.print("Введите n для треугольной последовательности: ");
        int n1 = scanner.nextInt();
        System.out.println("Треугольная последовательность:");
        int count = 0;
        int num = 1;
        for (int i = 1; count < n1; i++) {
            for (int j = 0; j < i && count < n1; j++) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();


        // Задание 2: От 1 до n
        System.out.print("Введите n для последовательности от 1 до n: ");
        int n2 = scanner.nextInt();
        System.out.println("Последовательность от 1 до " + n2 + ":");
        for (int i = 1; i <= n2; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        // Задание 3: От A до B
        System.out.print("Введите A: ");
        int a = scanner.nextInt();
        System.out.print("Введите B: ");
        int b = scanner.nextInt();
        System.out.println("Последовательность от A до B:");
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = a; i >= b; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        scanner.close();
    }
}

