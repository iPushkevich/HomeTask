package by.pushkevich.lesson1.task4;

/*
    Вычеслить значение функци:
         F(x) = -x^3 + 9, если х <= 13
         F(x) = -3 / (x + 1), если x > 13
*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*
     Вычисляет значение заданой функции.
     Проверка типа входных данных не выполнялась
*/
public class Task4 {
    public static void main(String[] args) {
        printResult(29);
    }

    // Выводит результат согласно заданному условию.
    private static void printResult(int i) {
        double result;
        System.out.print("The result is: ");
        if (i <= 13) {
            result = Math.pow(-i, 3) + 9;
        } else {
            result = -(double) 3 / (i + 1);
        }
        System.out.println(result);
    }

//    private static void run() {
//        try (Scanner scanner = new Scanner(System.in)) {
//            System.out.println("Enter an integer:");
//            printResult(scanner.nextInt());
//        }
//    }
}
