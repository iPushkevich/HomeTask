package by.pushkevich.lesson1.task2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

/*
        Вычислите число и месяц в невисокосном году по номеру дня.
        Проверка типа входных данных не выполнялась
*/
public class Task2 {
    public static void main(String[] args) {
        run();
    }

    // Вычисляет число и месяц в невисокосном году по номеру дня
    private static void getDateByDayNumber(int dayNumber) {
        Calendar calendar = new GregorianCalendar(2019, Calendar.JANUARY, dayNumber);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM", Locale.ENGLISH);

        System.out.println(simpleDateFormat.format(calendar.getTime()));
    }

    private static void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number of day:");
            getDateByDayNumber(scanner.nextInt());
        }
    }
}
