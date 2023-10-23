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
        System.out.println("Summa all int in array: " + summaMatrix(matrix));
        System.out.println("############################################");

        int[] arrayMinimum = minElemetInMatrix(matrix);
        System.out.println("The minimum elements for each row: ");
        showArrayMinimum(arrayMinimum);

        System.out.println("############################################");
        int absolutMinimum = findMinimum(arrayMinimum);
        System.out.println("Absolute minimum: " + absolutMinimum);
        System.out.println("############################################");

        System.out.println("Divide each element of the matrix by the absolute minimum: ");
        if (absolutMinimum == 0) {
            System.out.println("Absolute minimum is 0, division is not possible!");
        } else {
            devisionAllElementsMatrix(matrix, absolutMinimum);
            showArray(matrix);
            System.out.println("############################################");
        }


    }

    private static void devisionAllElementsMatrix(int[][] matrix, int absolutMinimum) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] /= absolutMinimum;

            }
        }
    }

    private static void showArrayMinimum(int[] arrayMinimum) {
        for (int element : arrayMinimum) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static int[] minElemetInMatrix(int[][] matrix) {
        int[] array = new int[matrix.length];

        for (int i = 0; i < array.length; i++) {
            if (matrix[i].length != 0) {
                array[i] = findMinimum(matrix[i]);

            } else {
                System.out.println("There are empty elements in the matrix. It is impossible to find an absolute minimum");
            }
        }
        return array;
    }

    public static int findMinimum(int[] lines) {
        int min = lines[0];
        for (int element : lines) {
            if (element < min) {
                min = element;
            }
        }
        return min;
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
            for (int j = 0; j < matrix.length - 1; j++) {
                if (matrix[j] < matrix[j + 1]) {
                    swap(matrix, j);
                }
            }
        }
    }

    private static void sortAsc(int[] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
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


