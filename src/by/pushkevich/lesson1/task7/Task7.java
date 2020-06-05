package by.pushkevich.lesson1.task7;

import java.util.Locale;
import java.util.Scanner;

/*
    Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
    Поменять местами дробную и целую части числа и вывести полученное значение числа.
    Проверка типа входных данных не выполнялась
*/

public class Task7 {
    public static void main(String[] args) {
        printResult(123.456);
    }

    // Выводит число с замененной местами целой и дробной части аргумента
    private static void printResult(double number) {
        int a = (int) Math.floor(number);
        int b = (int) (number * 1000 - a * 1000);
        double result = b + ((double) a / 1000);

        System.out.println("After swap: " + result);
    }

//    private static void run() {
//        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
//            System.out.println("Enter a number (nnn.mmm):");
//            printResult(scanner.nextDouble());
//        }
//    }
}
