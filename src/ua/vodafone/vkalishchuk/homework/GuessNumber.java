package ua.vodafone.vkalishchuk.homework;


import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomValue = ThreadLocalRandom.current().nextInt(0, 11); //генерація рандомного числа від 0 до 10 включно
        int maxAttempts = 6;
        System.out.println(randomValue);
        System.out.println("Let's start!!");
        System.out.println("The game's name is 'Guess the number!!'.");
        System.out.println("You have " + maxAttempts + " attempts to guess the number from 0 to 10.");
        for (int i = 1; i <= maxAttempts; i++) {
            System.out.print("Enter the number: ");
            int userValue = scanner.nextInt();
            if (userValue == randomValue) { // умова для перемоги користувача
                System.out.println("Great!!");
                System.out.println("You win! My number was - " + randomValue + ".");
                break;
            } else if (i == maxAttempts) { // умова використання всіх спроб
                System.out.println("Game over! My number was - " + randomValue + ". You lost.");
            } else {


                System.out.println("You have " + (maxAttempts - i) + " attempts.");
            }
        }
    }
}




