/**
 * Напишите программу, которая будет транспортировать заданную квадратную матрицу без использования дополнительного массива.
 * Транспортированная матрица - это матрица, полученная из исходной матрицы путем замены строк на столбцы.
 * [1 2]   [1 3]
 * [3 4]   [2 4]
 */
package tasks;

public class TransportedMatrix {

    public static void main(String[] args) {

        final int SIZE = 5;
        int[][] squareMatrix = new int[SIZE][SIZE];

        fillSquareMatrix(squareMatrix);
        System.out.println("Initial matrix: ");
        printInitialMatrix(squareMatrix);
        System.out.println("");
        matrixTransportation(squareMatrix);
        System.out.println("Transported matrix: ");
        printTransportedMatrix(squareMatrix);
    }

    public static int[][] fillSquareMatrix(int[][] squareMatrix) {
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length; j++) {
                squareMatrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return squareMatrix;
    }

    public static int[][] printInitialMatrix(int[][] squareMatrix) {
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length; j++) {
                System.out.printf("%2d", squareMatrix[i][j]);
            }
            System.out.println("");
        }
        return squareMatrix;
    }

    public static int[][] matrixTransportation(int[][] squareMatrix) {
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = i + 1; j < squareMatrix[i].length; j++) {
                if (i != j) {
                    int t = squareMatrix[i][j];
                    squareMatrix[i][j] = squareMatrix[j][i];
                    squareMatrix[j][i] = t;
                }
            }
        }
        return squareMatrix;
    }

    public static int[][] printTransportedMatrix(int[][] squareMatrix) {
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length; j++) {
                System.out.printf("%2d", squareMatrix[i][j]);
            }
            System.out.println("");
        }
        return squareMatrix;
    }
}

