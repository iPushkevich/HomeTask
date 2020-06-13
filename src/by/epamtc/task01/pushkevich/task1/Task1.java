package by.epamtc.task01.pushkevich.task1;

/*
    Вычислите значение выражения по формуле
    Проверка типа входных данных не выполнялась
*/
public class Task1 {
    public static void main(String[] args) {
        System.out.println(getResult(2, 2));
    }

    // Возвращает значение выражения согласно заданой формуле. На вход принимает 3 значения int
    private static double getResult(int a, int b) {
        final int c = 4;

        return ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)
                - Math.pow(a, 3) * c
                + Math.pow(b, -2));
    }
}

