/**
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1
 * до введенного пользователем числа.
 */
package tasks;

public class SumOfAllNumbersFromOneToEnteredByUser {

    public static void main(String[] args) {

        int numberByUser = 0;
        for (int i = 0; i < args.length; i++) {
            numberByUser = Integer.parseInt(args[i]);
        }
        showSum(numberByUser);
    }

    public static void showSum(int number) {
        System.out.println((number * (number + 1) / 2) + "");   // Сумма чисел от 1 до N рассчитывается по формуле N * (N + 1) / 2
    }
}
