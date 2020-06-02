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
        run();
    }

    // Выводит результат согласно заданному условию. На вход принимает int
    private static void getResult(int i) {
        BigDecimal result;
        System.out.print("The result is: ");
        if (i <= 13) {
            long x = (long) i * -1;
            result = new BigDecimal(x);
            for (int z = 0; z < 2; z++) {
                result = result.multiply(BigDecimal.valueOf(x));
            }
            result = result.add(BigDecimal.valueOf(9));
        }
        else {
            result = new BigDecimal(-(double) 3 / (i + 1));
        }
        System.out.println(result);
    }

    private static void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter an integer:");
            getResult(scanner.nextInt());
        }
    }
}
