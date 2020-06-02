package by.pushkevich.lesson1.task3;

import java.util.Scanner;

/*
        Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так.
        Проверка типа входных данных не выполнялась
*/

public class Task3 {
    public static void main(String[] args) {
        run();
    }

    // Выводит удвоенное значение аргуменотов
    private static void doubleTheNumbers(double a, double b, double c) {
        System.out.println("The numbers are decreasing, the result is:");
        System.out.println("a = " + a * 2);
        System.out.println("b = " + b * 2);
        System.out.println("c = " + c * 2);
    }

    // Выводит абсолютное значение аргументов
    private static void getNumbersAbs(double a, double b, double c) {
        System.out.println("The numbers aren`t  decreasing, the result is:");
        System.out.println("a = " + Math.abs(a));
        System.out.println("b = " + Math.abs(b));
        System.out.println("c = " + Math.abs(c));
    }

    /* Проверка соответсвия условию a > b > c*/
    private static boolean checkNumbersDecreasing(double a, double b, double c) {
        return a > b && b > c;
    }

    private static void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a, b, c:");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            if (checkNumbersDecreasing(a, b, c)) doubleTheNumbers(a, b, c);
            else getNumbersAbs(a, b, c);

        }
    }
}