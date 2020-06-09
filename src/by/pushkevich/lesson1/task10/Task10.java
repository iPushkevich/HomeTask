package by.pushkevich.lesson1.task10;

import java.util.Scanner;

/*      Напишите программу, которая для введенной последовательности целых ненулевых чисел
        (признак окончания ввода - ввод 0, количество чисел не меньше 2) определяет:
        - является ли последовательность возрастающей;
        - есть ли в ней хотя бы одна пара одинаковых соседних чисел;
        - является ли последовательность знакочередующейся (3, -2, 4, -5, 0 - да; 5, -4, -7, 8, 0 - нет)
        Проверка типа входных данных не выполнялась
*/
public class Task10 {
    public static void main(String[] args) {
        run();
    }

    // Проверяет, возрастает ли последовательность
    private static boolean isIncreasing(int a, int b) {
        return b > a;
    }

    // Проверяет, имеются ли равные "соседи"
    private static boolean isEqualNumbers(int a, int b) {
        return a == b;
    }

    // Проверяет, чередуются ли знаки аргументов
    private static boolean isRotation(int a, int b) {
        return ((a > 0 && b < 0) || (a < 0 && b > 0));

    }

    private static void run() {
        System.out.println("Enter numbers (two and more):" + "\n" + "0 - exit");

        try (Scanner scanner = new Scanner(System.in)) {
            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();
            String part1 = null;
            String part2 = null;
            String part3 = null;

            while (secondNumber != 0) {
                if (secondNumber > firstNumber) part1 = "The numbers are increasing, ";
                else part1 = "The numbers aren`t increasing, ";

                if (firstNumber == secondNumber) part2 = "the line contains equal numbers, ";
                else part2 = "the line doesn`t contain equal numbers, ";

                if ((firstNumber > 0 && secondNumber < 0) || (firstNumber < 0 && secondNumber > 0)) part3 = "has rotation";
                else part3 = "has no rotation";

                firstNumber = secondNumber;
                secondNumber = scanner.nextInt();
            }

            System.out.println(part1 + part2 + part3);
        }
    }
}
