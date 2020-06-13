package by.epamtc.task01.pushkevich.task3;

/*
        Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так.
        Проверка типа входных данных не выполнялась
*/

public class Task3 {
    public static void main(String[] args) {
        printResult(4, -5, 2);
    }

    // Возвращает удвоенное значение аргуменотов
    private static double getDoubleNumber(double a) {
        return a * 2;
    }

    // Возвражает абсолютное значение аргументов
    private static double getNumberAbs(double a) {
        return Math.abs(a);
    }


    private static void printResult(double a, double b, double c) {
        if (a > b && b > c) {
            System.out.println(getDoubleNumber(a) + " " + getDoubleNumber(b) + " " + getDoubleNumber(c));
        } else
            System.out.println(getNumberAbs(a) + " " + getNumberAbs(b) + " " + getNumberAbs(c));
    }
}
