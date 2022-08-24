/**
 * Необходимо вывести на экран таблицу умножения на 3.
 */
package tasks;

public class MultiplicationTableForThree {

    private static final int MULTIPLICATION_FOR = 3;
    private static final int SIZE_OF_TABLE = 11;

    public static void main(String[] args) {

        String[] multiplicationTable = new String[SIZE_OF_TABLE];

        createMultiplicationTable(MULTIPLICATION_FOR, multiplicationTable);
        print(multiplicationTable);
    }

    public static void createMultiplicationTable(int n, String[] array) { // метод принимает число и создает таблицу умножения
        String multiply = " * ";
        String equals = " = ";
        for (int i = 1; i <= 10; i++) {
            array[i] = i + multiply + n + equals + (i * n);
        }
    }

    public static void print(String[] array) { // метод выводит таблицу умножения
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println(array[i] + " ");
            }
        }
    }
}
