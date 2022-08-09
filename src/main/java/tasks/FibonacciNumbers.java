/**
 * Вывести на экран первые 11 чисел Фибоначчи. Напоминаем, что:
 * - первый и второй члены последовательности равны единицам,
 * - а каждый последующий - сумме двух предыдущих,
 * - то есть числа Фибоначчи - это 1 1 2 3 4 8 13 21 34 55 89 и т.д.
 */
package tasks;

public class FibonacciNumbers {

    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 1;
        int thirdNumber;
        System.out.print(firstNumber + " " + secondNumber + " ");
        for (int i = 3; i <= 11; i++) {
            thirdNumber = firstNumber + secondNumber;
            System.out.print(thirdNumber + " ");
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }
        System.out.println(" ");
    }
}
