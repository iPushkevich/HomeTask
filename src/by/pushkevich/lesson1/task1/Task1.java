package by.pushkevich.lesson1.task1;

/*
    Вычислите значение выражения по формуле
    Проверка типа входных данных не выполнялась
*/
public class Task1 {
    public static void main(String[] args) {
        printResult(2, 2);
    }

    // Возвращает значение выражения согласно заданой формуле. На вход принимает 3 значения int
    private static void printResult(int a, int b) {
        final int c = 4;
        double result = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)
                - Math.pow(a, 3) * c
                + Math.pow(b, -2));

        System.out.println("The result is: " + result);
    }

//    private static void run() {
//        try (Scanner scanner = new Scanner(System.in)) {
//            System.out.println("Enter a, b, c: ");
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            int c = scanner.nextInt();
//
//            printResult(a, b, c);
//        }
//    }
}

