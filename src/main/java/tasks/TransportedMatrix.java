/**
 * Напишите программу, которая будет транспортировать заданную квадратную матрицу без использования дополнительного массива.
 * Транспортированная матрица - это матрица, полученная из исходной матрицы путем замены строк на столбцы.
 * пример: [1 2]   [1 3]
 *         [3 4]   [2 4]
 */
package tasks;

public class TransportedMatrix {

    private static final int MATRIX_SIZE = 5;

    public static void main(String[] args) {

        int[][] squareMatrix = new int[MATRIX_SIZE][MATRIX_SIZE];

        fillSquareMatrix(squareMatrix);
        System.out.println("Initial matrix: ");
        print(squareMatrix);
        System.out.println("");
        matrixTransportation(squareMatrix);
        System.out.println("Transported matrix: ");
        print(squareMatrix);
    }

    public static void fillSquareMatrix(int[][] squareMatrix) { // метод заполняет квадратную матрицу
        for (int i = 0; i < squareMatrix.length; i++) {     // случайными числами
            for (int j = 0; j < squareMatrix[i].length; j++) {
                squareMatrix[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void matrixTransportation(int[][] squareMatrix) { // метод транспортирует матрицу
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = i + 1; j < squareMatrix[i].length; j++) {
                if (i != j) {
                    int t = squareMatrix[i][j];
                    squareMatrix[i][j] = squareMatrix[j][i];
                    squareMatrix[j][i] = t;
                }
            }
        }
    }

    public static void print(int[][] squareMatrix) {  // метод выводит матрицу
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length; j++) {
                System.out.printf("%2d", squareMatrix[i][j]);
            }
            System.out.println("");
        }
    }
}

