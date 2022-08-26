/**
 * Необходимо вывести на консоль такую последовательность чисел:
 * 1 2 4 8 16 32 64 128 256 512.
 */
package tasks;

public class NumbersFromOne {

//    public static void main(String[] args) {   // метод с циклом do/while
//
//        int multiply = 1;
//        int i = 1;
//        int firstNumber = 1;
//        System.out.print(firstNumber + " ");
//        do {
//            multiply = multiply * 2;
//            i++;
//            System.out.print(multiply + " ");
//        } while (i < 10);
//    }

    private static final int MAX_NUMBER = 512;
    private static final int MULTIPLIER = 10;

    public static void main(String[] args) {

        int[] sequenceOfNumbers = new int[MAX_NUMBER / MULTIPLIER];

        fillArrayBySequenceOfNumbers(sequenceOfNumbers, MAX_NUMBER);
        print(sequenceOfNumbers);
    }

    public static void fillArrayBySequenceOfNumbers(int[] array, int max) {  // метод принимает максимальное число
        for (int i = array.length - 1; i >= 0; i--) {   // и заполняет массив последовательностью чисел до этого числа
            array[i] = max;
            max = max / 2;
        }
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
