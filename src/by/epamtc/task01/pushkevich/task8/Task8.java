package by.epamtc.task01.pushkevich.task8;

/*
    Вычислить значения заданой функции на отрезке [a,b] c шагом h
    Проверка типа входных данных не выполнялась
*/

import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        printResult(getResult(-10, 20, 5));
    }

    private static List<Integer> getResult(int a, int b, int step) {
        final int c = 3;
        List<Integer> results = new ArrayList<>();
        int result;

        while (a <= b) {
            if (a == 15) {
                result = (a + c) * 2;
                a += step;
                results.add(result);
            } else {
                result = (a - c) + 6;
                a += step;
                results.add(result);
            }
        }
        return results;
    }

    private static void printResult(List<? extends Number> results) {
        for(Number n: results){
            System.out.print(n + " ");
        }
    }
}
