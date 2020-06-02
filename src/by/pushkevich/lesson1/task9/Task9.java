package by.pushkevich.lesson1.task9;

/*
    Вычислить: (1+2) * (1+2+3) * ... * (1+2+...+10).
    Проверка типа входных данных не выполнялась
*/
public class Task9 {
    public static void main(String[] args) {
        nonRecSolution();
    }

    // Вычесляет значение выражения согласно заданому условию.
    private static void nonRecSolution() {
        int start = 2;
        int sum = 3;
        long result = 3;
        while (start < 10) {
            start++;
            sum += start;
            result *= sum;
        }
        System.out.println("The result is: " + result);
    }
}
