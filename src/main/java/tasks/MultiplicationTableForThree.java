/**
 * Необходимо вывести на экран таблицу умножения на 3.
 */
package tasks;

public class MultiplicationTableForThree {

    public static void main(String[] args) {
        final int NUMBER = 3;
        final int SIZE = 11;
        String[] multiplicationTable = new String[SIZE];

        countMultiplicationTable(NUMBER, multiplicationTable);
        printMultiplicationTable(multiplicationTable);
    }

    public static String[] countMultiplicationTable(int n, String[] multiplicationTable) { // метод принимает число и считает таблицу умножения
        String multiply = " * ";
        String equals = " = ";
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i] = i + multiply + n + equals + (i * n);
        }
        return multiplicationTable;
    }

    public static String[] printMultiplicationTable(String[] multiplicationTable) { // метод выводит таблицу умножения
        for (int i = 0; i < multiplicationTable.length; i++) {
            if (multiplicationTable[i] != null) {
                System.out.println(multiplicationTable[i] + " ");
            }
        }
        return multiplicationTable;
    }
}
