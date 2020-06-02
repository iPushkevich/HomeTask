package by.pushkevich.lesson1.task8;

import java.util.Scanner;

/*
    Вычислить значения заданой функции на отрезке [a,b] c шагом h
    Проверка типа входных данных не выполнялась
*/

public class Task8 {
    public static void main(String[] args) {
        run();
    }

    private static void getResult(int a, int b, int step) {
        final int c = 3;
        int result;
        while (a <= b) {
            if (a == 15) {
                result = (a + c) * 2;
                a += step;
                System.out.print(result + " ");
            } else {
                result = (a - c) + 6;
                a += step;
                System.out.print(result + " ");
            }
        }
    }

    private static void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a section [a, b]:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a > b) {
                System.out.println("Incorrect input. Try again");
                run();
            }
            System.out.println("Enter a step:");
            int step = scanner.nextInt();
            if (step > (Math.abs(a) + b)) {
                System.out.println("The step bigger than section. Try again");
                run();
            }
            System.out.println("The result is:");
            getResult(a, b, step);
        }
    }
}
