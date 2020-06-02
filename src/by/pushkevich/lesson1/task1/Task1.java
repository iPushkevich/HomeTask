package by.pushkevich.lesson1.task1;

import java.math.BigDecimal;
import java.util.Scanner;

/*
    Вычислите значение выражения по формуле
    Проверка типа входных данных не выполнялась
*/
public class Task1 {
    public static void main(String[] args) {
        run();
    }

    // Возвращает значение выражения согласно заданой формуле. На вход принимает 3 значения int
    private static void solution(int a, int b, int c) {
        BigDecimal  result = new BigDecimal((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)
                - Math.pow(a, 3) * c
                + Math.pow(b, -2));

        System.out.println("The result is: " + result);
    }

    private static void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a, b, c: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            solution(a, b, c);
        }
    }
}

