/**
 * Напишите программу, которая будет транспортировать заданную квадратную матрицу без использования дополнительного массива.
 * Транспортированная матрица - это матрица, полученная из исходной матрицы путем замены строк на столбцы.
 * [1 2]   [1 3]
 * [3 4]   [2 4]
 */
package tasks;

public class TransportedMatrix {

    public static void main(String[] args) {

        int[][] squareMatrix = {{1, 2}, {3, 4}};
        System.out.println("Initial matrix: ");
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length; j++) {
                System.out.printf("%2d", squareMatrix[i][j]);
            }
            System.out.println("");
        }

        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = i + 1; j < squareMatrix[i].length; j++) {
                if (i != j) {
                    int t = squareMatrix[i][j];
                    squareMatrix[i][j] = squareMatrix[j][i];
                    squareMatrix[j][i] = t;
                }
            }
        }

        System.out.println("Transported matrix: ");
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length; j++) {
                System.out.printf("%2d", squareMatrix[i][j]);
            }
            System.out.println("");
        }
    }
}

