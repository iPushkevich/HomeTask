package by.epamtc.task01.pushkevich.task6;

/*
    Сумма первых n членов арифметической прогрессии вычисляется по формуле Sn = ( a1 + an )* n / 2.
    Даны a1 и d (шаг арифметической прогрессии).
    Найдите n, при котором значение Sn выходит за диапазон типов int и long (экспериментальным путем).
    Проверка входных данных не выполнялась
*/
public class Task6 {
    public static void main(String[] args) {
        System.out.println(getIntOverflow(Integer.MIN_VALUE, Integer.MIN_VALUE));
        System.out.println(getLongOverflow(100500, 100500));
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

    private static int getIntOverflow(int firstElement, int step) {
        int n = 1; // Кол-во элементов
        long sum = firstElement; // Сумма элементов
        long nextElement = firstElement; // Следующий элемент

        while (sum <= Integer.MAX_VALUE && sum >= Integer.MIN_VALUE) {
            nextElement += (long) step;
            sum += nextElement;
            n++;
        }
        return n;
    }

    private static long getLongOverflow(long firstElement, long step) {
        long n = 1; // Кол-во элементов
        double sum = firstElement; // Сумма элементов
        double nextElement = firstElement; // Следующий элемент

        // При начальном значении Long.MIN_VALUE, любой второй элемент будет переполняющим
        if (firstElement == Long.MIN_VALUE) n = 2;
        else {
            while (sum <= Long.MAX_VALUE && sum >= Long.MIN_VALUE) {
                nextElement += step;
                sum += nextElement;
                n++;
            }
        }
        return n;
    }
}
