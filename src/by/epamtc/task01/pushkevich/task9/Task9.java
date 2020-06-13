package by.epamtc.task01.pushkevich.task9;

/*
    Вычислить: (1+2) * (1+2+3) * ... * (1+2+...+10).
    Проверка типа входных данных не выполнялась
*/
public class Task9 {
    public static void main(String[] args) {
        System.out.println(getResult());
    }

    // Вычисляет значение выражения согласно заданому условию.
    private static long getResult() {
        int point = 2; // Цифра после первой итерации
        int sum = 3; // Сумма первой итерации
        long result = sum;

        while (point < 10) {
            point++;
            sum += point;
            result *= sum;
        }

        return result;
    }
}
