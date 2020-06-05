package by.pushkevich.lesson1.task6;

/*
    Сумма первых n членов арифметической прогрессии вычисляется по формуле Sn = ( a1 + an )* n / 2.
    Даны a1 и d (шаг арифметической прогрессии).
    Найдите n, при котором значение Sn выходит за диапазон типов int и long (экспериментальным путем).
    Проверка входных данных не выполнялась
*/
public class Task6 {
    public static void main(String[] args) {
        printIntOverflow(100, 500);
        printLongOverflow(100, 500);
    }

    /*
        Попытка избавиться от перебора и искать n исходя из максимального int через квадратное уравнение
    */
//    private static void getResult(long x, long step) {
//        long n;
//        long maxIntSum = Integer.MAX_VALUE; // МАксимально возможная сумма элементов
//        long disc = (-1 * (2 * x - step)) - (4 * step * (maxIntSum * -2)); // Находим дискриминант
//        n = (int) (-(2 * x - step) + Math.sqrt(disc)) / (2 * step); // Получаем кол-во элементов, которое гарантировано не переполняет тип
//        n++; // Добавляем переполняющий элемент
//
//        System.out.println("n = " + n + " overflows Integer");
//    }

    private static void printIntOverflow(int firstElement, int step) {
        int n = 1; // Кол-во элементов
        long sum = firstElement; // Сумма элементов
        int nextElement = firstElement + step; // Следующий элемент

        while (sum <= Integer.MAX_VALUE && sum >= Integer.MIN_VALUE) {
            sum += nextElement;
            nextElement += step;
            n++;
        }

        System.out.println("n = " + n + " overflows Integer");
    }

    private static void printLongOverflow(int firstElement, int step) {
        long n = 1; // Кол-во элементов
        double sum = firstElement; // Сумма элементов
        long nextElement = firstElement + step; // Следующий элемент

        while (sum <= Long.MAX_VALUE && sum >= Long.MIN_VALUE) {
            sum += nextElement;
            nextElement += step;
            n++;
        }

        System.out.println("n = " + n + " overflows Long");
    }


//    private static void run() {
//        try (Scanner scanner = new Scanner(System.in)) {
//            System.out.println("Enter start position:");
//            int start = scanner.nextInt();
//
//            System.out.println("Enter a step:");
//            int step = scanner.nextInt();
//
//            if (step == 0) {
//                System.out.println("Incorrect input. Try again");
//                run();
//            }
//
////            getResult(start, step);
//            printIntOverflow(start, step);
//            printLongOverflow(start, step);
//        }
//    }
}
