package by.epamtc.task01.pushkevich.task7;

/*
    Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
    Поменять местами дробную и целую части числа и вывести полученное значение числа.
    Проверка типа входных данных не выполнялась
*/

public class Task7 {
    public static void main(String[] args) {
        System.out.println(getResult(123.456));
    }

    // Возвращает число с замененной местами целой и дробной части аргумента
    private static double getResult(double number) {
        int a = (int) Math.floor(number);
        int b = (int) (number * 1000 - a * 1000);

        return b + ((double) a / 1000);
    }
}
