package by.pushkevich.lesson1.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        run();
    }

    private static void getResult(int x, int step) {
        long n;
//        int sum3 = (x + (x + step * (n - 1))) * n / 2;
        long maxIntSum = Integer.MAX_VALUE; // МАксимально возможная сумма элементов

        // При отрицательном шаге имитируем положительное направление
        if (step < 0) {
            maxIntSum = (long) Integer.MAX_VALUE + 1 + x;
            step = -step;
            x = -x;
        }

        long desc = (-1 * (2 * x - step)) - (4 * step * (maxIntSum * -2)); // Находим дескриминант
        n = (int) (-(2 * x - step) + Math.sqrt(desc)) / (2 * step); // Получаем кол-во элементов, которое гарантировано не переполняет тип
        n++; // Добавляем переполняющий элемент

        System.out.println("n = " + n + " overflows Integer");
    }

    private static void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter start position:");
            int start = scanner.nextInt();
            System.out.println("Enter a step:");
            int step = scanner.nextInt();

            if (step == 0) {
                System.out.println("Incorrect input. Try again");
                run();
            }

            getResult(start, step);
        }
    }
}
