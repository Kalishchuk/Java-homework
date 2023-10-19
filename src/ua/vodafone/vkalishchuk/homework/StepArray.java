package ua.vodafone.vkalishchuk.homework;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class StepArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of the lines in array: ");
        int lines = scanner.nextInt();
        System.out.print("Enter number of the elements in array: ");
        int elements = scanner.nextInt();
        if (elements <= 1) {
            System.out.println("The value can't be 0 or less!");
            return;
        }

        System.out.println("############################################");
        int[][] matrix = gemeratorArray(lines, elements);
        System.out.println("The generated array looks like: ");
        showArray(matrix);

        sotrMatrix(matrix);
        System.out.println("############################################");
        System.out.println("Sorted arrays looks like: ");
        showArray(matrix);
        System.out.println("############################################");


        System.out.println("############################################");
        summaMatrix(matrix);
        System.out.println("Summa all int in array: " + summaMatrix(matrix));
        System.out.println("############################################");
    }

    private static void sotrMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
                if ((i + 1) % 2 == 0) {
                    sortAsc(matrix[i]);
                } else {
                    sortDesc(matrix[i]);
                }
            }

    }

    private static void sortDesc(int[] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length -1; j++) {
                if (matrix[j] < matrix[j + 1]) {
                    swap(matrix, j);
                }
            }
        }
    }

    private static void sortAsc(int[] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length -1; j++) {
                if (matrix[j] > matrix[j + 1]) {
                    swap(matrix, j);
                }
            }
        }
    }

    private static void swap(int[] matrix, int j) {
        int tmp = matrix[j];
        matrix[j] = matrix[j + 1];
        matrix[j + 1] = tmp;
    }

    private static int summaMatrix(int[][] matrix) {
        int sum = 0;
        for (int[] colum : matrix) {
            for (int element : colum) {
                sum += element;
            }
        }
        return sum;
    }


    public static void showArray(int[][] matrix) {
        for (int[] array : matrix) {
            System.out.print("[ ");
            for (int element : array) {
                System.out.print(element + ", ");
            }
            System.out.println("]");
        }
    }


    public static int[][] gemeratorArray(int lines, int elements) {
        int[][] array = new int[lines][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[ThreadLocalRandom.current().nextInt(elements)];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ThreadLocalRandom.current().nextInt(100);
            }
        }
        return array;
    }
}


