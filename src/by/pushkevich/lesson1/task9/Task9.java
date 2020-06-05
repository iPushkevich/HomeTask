package by.pushkevich.lesson1.task9;

/*
    Вычислить: (1+2) * (1+2+3) * ... * (1+2+...+10).
    Проверка типа входных данных не выполнялась
*/
public class Task9 {
    public static void main(String[] args) {
        printResult();
    }

    // Вычисляет значение выражения согласно заданому условию.
    private static void printResult() {
        int point = 2; // Цифра после первой итерации
        int sum = 3; // Сумма первой итерации
        long result = sum;

        while (point < 10) {
            point++;
            sum += point;
            result *= sum;
        }

        System.out.println("The result is: " + result);
    }
}
