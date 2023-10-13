package ua.vodafone.vkalishchuk.homework;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter count array in matrix: ");
        int array = scanner.nextInt();
        System.out.println("Enter count elements in the array: ");
        int element = scanner.nextInt();

        int[][] matrix = matrixRandomaizer(array, element);

        System.out.println("Matrix is: ");
        displayMatrix(matrix);

        int[][] transMatrix = transposition(matrix);
        System.out.println("Transposition matrix: ");
        displayMatrix(transMatrix);
    }

    public static int[][] transposition(int[][] matrix) {
        int[][] transArray = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transArray[j][i] = matrix[i][j];
            }
        }
        return transArray;
    }


    public static void displayMatrix(int[][] matrix) {
        for (int[] array : matrix) {
            for (int element : array) {
                System.out.print(element + ", ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixRandomaizer(int array, int element) {
        int[][] matrix = new int[array][element];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(50);
            }
        }
        return matrix;
    }
}
