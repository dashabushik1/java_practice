/**
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1
 * до введенного пользователем числа.
 */
package tasks;

public class SumOfAllNumbersFromOneToEnteredByUser {

    public static void main(String[] args) {

        int sum = 0;
        int number = 0;
        for (int i = 0; i < args.length; i++) {
            number = Integer.parseInt(args[i]);
        }

        if (number <= 0) {
            throw new RuntimeException("Number must be positive!");
        }

        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
