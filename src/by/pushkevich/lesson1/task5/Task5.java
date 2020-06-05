package by.pushkevich.lesson1.task5;

import java.util.Scanner;

/*
    Дано трехзначное число. Определите:
    - сумму и произведение цифр числа;
    - число, полученное перестановкой цифр сотен и десятков;
    - четырехзначное число, полученное приписыванием цифры единиц в качестве цифры тысяч (например, из числа 137 необходимо получить число 7137).
      Проверка типа входных данных не выполнялась
*/

public class Task5 {
    public static void main(String[] args) {
        run(234);
    }

    // Выводит сумму аргументов
    private static void getSum(int a, int b, int c) {
        System.out.println("The sum of digits is: " + (a + b + c));
    }

    // Выводит произведение аргументов
    private static void multiply(int a, int b, int c) {
        System.out.println("Multiply: " + (a * b * c));
    }

    // Меняет местами сотни и десятки в исходном выражении
    private static void swapHundredsAndDozens(int a, int b, int c) {
        System.out.println("After swap hundreds and dozens: " + (b * 100 + a * 10 + c));
    }

    // Добавляет к исходному выражению количество тысяч, равное значению едениц
    private static void addThousands(int number, int c) {
        System.out.println("After thousands add: " + (number + c * 1000));
    }

    private static void run(int number) {
        int firstDigit = number / 100;
        int secondDigit = number % 100 / 10;
        int thirdDigit = number % 100 % 10;

        getSum(firstDigit, secondDigit, thirdDigit);
        multiply(firstDigit, secondDigit, thirdDigit);
        swapHundredsAndDozens(firstDigit, secondDigit, thirdDigit);
        addThousands(number, thirdDigit);
    }
}
