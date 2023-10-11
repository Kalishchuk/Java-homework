package ua.vodafone.vkalishchuk.homework;

import java.util.concurrent.ThreadLocalRandom;

public class Lottery {
    public static void main(String[] args) {
        int countNumbers = 7;
        int[] organisatorNumbers = randomNumbers(countNumbers);
        int[] userNumbers = randomNumbers(countNumbers);

        System.out.println("Random numbers:");
        System.out.print("Organisator's -- ");
        printData(organisatorNumbers);
        System.out.print("User's --------- ");
        printData(userNumbers);

        System.out.println();
        numbersSorting(organisatorNumbers);
        numbersSorting(userNumbers);

        System.out.println("Sorted numbers:");
        System.out.print("Organisator's -- ");
        printData(organisatorNumbers);
        System.out.print("User's --------- ");
        printData(userNumbers);

        System.out.println();
        System.out.print("Number of matches: '" + matchNumbers(organisatorNumbers, userNumbers) + "'.");
    }

    public static int matchNumbers(int[] organisator, int[] player) {
        int match = 0;
        for (int i = 0; i < Math.min(organisator.length, player.length); i++) {
            if (organisator[i] == player[i]) {
                match++;
            }
        }
        return match;
    }

    public static void printData(int[] number) {
        for (int index : number) {
            System.out.print(index + ", ");
        }
        System.out.println();
    }

    public static void numbersSorting(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    public static int[] randomNumbers(int count) {
        int[] numbers = new int[count];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ThreadLocalRandom.current().nextInt(0, 10);
        }
        return numbers;
    }
}
