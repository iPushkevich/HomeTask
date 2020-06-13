package by.epamtc.task01.pushkevich.task5;

/*
    Дано трехзначное число. Определите:
    - сумму и произведение цифр числа;
    - число, полученное перестановкой цифр сотен и десятков;
    - четырехзначное число, полученное приписыванием цифры единиц в качестве цифры тысяч (например, из числа 137 необходимо получить число 7137).
      Проверка типа входных данных не выполнялась
*/

public class Task5 {
    public static void main(String[] args) {
        printResult(234);
    }

    private static void printResult(int number) {
        int firstDigit = number / 100;
        int secondDigit = number % 100 / 10;
        int thirdDigit = number % 100 % 10;

        System.out.println("The sum is: " + (firstDigit + secondDigit + thirdDigit));
        System.out.println("After multiply: " + (firstDigit * secondDigit * thirdDigit));
        System.out.println("After swap hundreds and dozens: " + (secondDigit * 100 + firstDigit * 10 + thirdDigit));
        System.out.println("After thousands add: " + (number + thirdDigit * 1000));
    }
}
