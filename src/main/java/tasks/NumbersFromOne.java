/**
 * Необходимо вывести на консоль такую последовательность чисел:
 * 1 2 4 8 16 32 64 128 256 512.
 */
package tasks;

public class NumbersFromOne {

    public static void main(String[] args) {
        int multiply = 1;
        for (int i = 1; i < 10; i++) {
            multiply = multiply * 2;
            System.out.print(multiply + " ");  // не выводится 1
        }
    }
}
