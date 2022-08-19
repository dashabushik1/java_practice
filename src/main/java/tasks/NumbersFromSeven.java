/**
 * Необходимо, чтобы программа выводила на экран вот такую последовательность:
 * 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
 */
package tasks;

public class NumbersFromSeven {

    public static void main(String[] args) {

        int maxNumber = 100;
        for (int i = 7; i < maxNumber; i = i + 7) {   // 1 способ
            System.out.print(i + " ");
        }

        System.out.println("");
        for (int i = 7; i <= 7; i++) {    // 2 способ
            for (int j = 1; j < 15; j++) {
                System.out.print((i * j) + " ");
            }
        }
    }
}
