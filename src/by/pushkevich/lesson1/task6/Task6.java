package by.pushkevich.lesson1.task6;

import java.util.Scanner;

/*
    Сумма первых n членов арифметической прогрессии вычисляется по формуле Sn = ( a1 + an )* n / 2.
    Даны a1 и d (шаг арифметической прогрессии).
    Найдите n, при котором значение Sn выходит за диапазон типов int и long (экспериментальным путем).
    Проверка входных данных не выполнялась
*/
public class Task6 {
    public static void main(String[] args) {
        run();
    }

    /*
        Попытка избавиться от перебора и искать n исходя из максимального int через квадратное уравнение
    */
    private static void getResult(long x, long step) {
        long n;
        long maxIntSum = Integer.MAX_VALUE; // МАксимально возможная сумма элементов
        long disc = (-1 * (2 * x - step)) - (4 * step * (maxIntSum * -2)); // Находим дискриминант
        n = (int) (-(2 * x - step) + Math.sqrt(disc)) / (2 * step); // Получаем кол-во элементов, которое гарантировано не переполняет тип
        n++; // Добавляем переполняющий элемент

        System.out.println("n = " + n + " overflows Integer");
    }

    private static void getIntOverflow(int x, int step) {
        int n = 1;
        long sum = x;
        int point = x + step;

        while (sum <= Integer.MAX_VALUE && sum >= Integer.MIN_VALUE) {
            sum += point;
            point += step;
            n++;
        }
        System.out.println("n = " + n + " overflows Integer");
    }

    private static void getLongOverflow(int x, int step) {
        long n = 1;
        double longSum = x;
        long point = x + step;

        while (longSum <= Long.MAX_VALUE && longSum >= Long.MIN_VALUE) {
            longSum += point;
            point += step;
            n++;
        }
        System.out.println("n = " + n + " overflows Long");
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
//            getResult(start, step);
            getIntOverflow(start, step);
            getLongOverflow(start, step);
        }
    }
}
