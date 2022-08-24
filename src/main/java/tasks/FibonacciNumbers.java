/**
 * Вывести на экран первые 11 чисел Фибоначчи. Напоминаем, что:
 * - первый и второй члены последовательности равны единицам,
 * - а каждый последующий - сумме двух предыдущих,
 * - то есть числа Фибоначчи - это 1 1 2 3 4 8 13 21 34 55 89 и т.д.
 */
package tasks;

public class FibonacciNumbers {

    private static final int LENGTH = 11;

    public static void main(String[] args) {

        int[] fibonacciNumbers = new int[LENGTH];

        fillArrayByFibonacciNumbers(fibonacciNumbers);
        print(fibonacciNumbers);
    }

    public static void fillArrayByFibonacciNumbers(int[] array) {  // метод заполняет массив числами Фибоначчи
        for (int i = 0; i < array.length; i++) {
            if (i < 2) {
                array[i] = 1;
            } else {
                array[i] = array[i - 2] + array[i - 1];
            }
        }
    }

    public static void print(int[] array) {  // метод выводит массив
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
