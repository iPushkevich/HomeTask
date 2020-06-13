package by.epamtc.task01.pushkevich.task2;

/*
        Вычислите число и месяц в невисокосном году по номеру дня.
        Проверка типа входных данных не выполнялась
*/
public class Task2 {
    public static void main(String[] args) {
        printDate(60);
    }

    private static void printDate(int dayNumber) {
        if (dayNumber <= 0 || dayNumber > 365) System.out.println("Incorrect input, Try again");

        int winter = 59;
        int spring = 151;
        int summer = 243;
        int autumn = 334;

        if (dayNumber <= 365 && dayNumber > autumn) {
            System.out.println("December " + (dayNumber - autumn));
        }
        if (dayNumber <= winter) {
            if (dayNumber <= 31) System.out.println("January " + dayNumber);
            else System.out.println("February " + (dayNumber - 31));
        }
        if (dayNumber > winter && dayNumber <= spring) {
            if (dayNumber <= 90) System.out.println("March " + (dayNumber - 59));
            if (dayNumber > 90 && dayNumber <= 120) System.out.println("April " + (dayNumber - 90));
            if (dayNumber > 120) System.out.println("May " + (dayNumber - 120));
        }
        if (dayNumber > spring && dayNumber <= summer) {
            if (dayNumber <= 181) System.out.println("June " + (dayNumber - 151));
            if (dayNumber > 181 && dayNumber <= 212) System.out.println("July " + (dayNumber - 181));
            if (dayNumber > 212) System.out.println("August " + (dayNumber - 212));
        }
        if (dayNumber > summer && dayNumber <= autumn) {
            if (dayNumber <= 273) System.out.println("September " + (dayNumber - 243));
            if (dayNumber > 273 && dayNumber <= 304) System.out.println("October " + (dayNumber - 273));
            if (dayNumber > 304) System.out.println("November " + (dayNumber - 304));
        }
    }

    // Вычисляет число и месяц в невисокосном году по номеру дня
//    private static void printDateByDayNumber(int dayNumber) {
//        Calendar calendar = new GregorianCalendar(2019, Calendar.JANUARY, dayNumber);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM", Locale.ENGLISH);
//
//        System.out.println(simpleDateFormat.format(calendar.getTime()));
//    }
//
//    private static void run() {
//        try (Scanner scanner = new Scanner(System.in)) {
//            System.out.println("Enter a number of day:");
//            printDateByDayNumber(scanner.nextInt());
//        }
//    }
}
