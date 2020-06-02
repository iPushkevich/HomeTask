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
    private static boolean checkIncreasing(int a, int b) {
        return b > a;
    }

    // Проверяет, имеются ли равные "соседи"
    private static boolean checkEqualNumbers(int a, int b) {
        return a == b;
    }

    // Проверяет, чередуются ли знаки аргументов
    private static boolean checkRotation(int a, int b) {
        return ((a > 0 && b < 0) || (a < 0 && b > 0));

    }

    private static void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter numbers (two and more):" + "\n" + "0 - exit");
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            boolean increasing = true;
            boolean equal = false;
            boolean rotation = true;
            String part1;
            String part2;
            String part3;
            while (second != 0) {
                if (!checkIncreasing(first, second)) increasing = false;
                if (checkEqualNumbers(first, second)) equal = true;
                if (!checkRotation(first, second)) rotation = false;
                first = second;
                second = scanner.nextInt();
            }
            if (increasing) part1 = "The numbers are increasing, ";
            else part1 = "The numbers aren`t increasing, ";

            if (equal) part2 = "the line contains equal numbers, ";
            else part2 = "the line doesn`t contain equal numbers, ";

            if (rotation) part3 = "has rotation";
            else part3 = "has no rotation";
            System.out.println(part1 + part2 + part3);

        }
    }
}
