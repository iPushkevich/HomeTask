package by.epamtc.task01.pushkevich.task4;

/*
    Вычеслить значение функци:
         F(x) = -x^3 + 9, если х <= 13
         F(x) = -3 / (x + 1), если x > 13
*/

public class Task4 {
    public static void main(String[] args) {
        System.out.println(getResult(29));
    }

    // Возвращает результат согласно заданному условию.
    private static double getResult(int i) {
        double result;

        if (i <= 13) {
            result = Math.pow(-i, 3) + 9;
        } else {
            result = -(double) 3 / (i + 1);
        }
        return result;
    }

}
