/**
 * Вывести на экран первые 11 чисел Фибоначчи. Напоминаем, что:
 * - первый и второй члены последовательности равны единицам,
 * - а каждый последующий - сумме двух предыдущих,
 * - то есть числа Фибоначчи - это 1 1 2 3 4 8 13 21 34 55 89 и т.д.
 */
package tasks;

public class FibonacciNumbers {

    public static void main(String[] args) {

        final int SIZE = 11;
        int[] fibonacciNumbers = new int[SIZE];

        fillArrayByFibonacciNumbers(fibonacciNumbers);
        printFibonacciNumbers(fibonacciNumbers);
    }

    public static int[] fillArrayByFibonacciNumbers(int[] fibonacciNumbers) {  // метод заполняет массив числами Фибоначчи
        for (int i = 0; i < fibonacciNumbers.length; i++) {
            if (i < 2) {
                fibonacciNumbers[i] = 1;
            } else {
                fibonacciNumbers[i] = fibonacciNumbers[i - 2] + fibonacciNumbers[i - 1];
            }
        }
        return fibonacciNumbers;
    }

    public static int[] printFibonacciNumbers(int[] fibonacciNumbers) {  // метод выводит массив
        for (int i = 0; i < fibonacciNumbers.length; i++) {
            System.out.print(fibonacciNumbers[i] + " ");
        }
        return fibonacciNumbers;
    }
}
