package ua.vodafone.vkalishchuk.homework;

import java.util.concurrent.ThreadLocalRandom;

public class Rugby {
    public static void main(String[] args) {
        int countPlayers = 26;
        int[] firstTeam = randomPlayersAges(countPlayers);
        int[] secondTeam = randomPlayersAges(countPlayers);

        System.out.print("Ages first team:  ");
        displayAge(firstTeam);
        System.out.println();
        System.out.print("Ages second team: ");
        displayAge(secondTeam);

        System.out.println();
        System.out.printf("Average arithmetic age of players = %.2f", arithmeticsAge(firstTeam));
        System.out.println();
        System.out.printf("Average arithmetic age of players = %.2f ", arithmeticsAge(secondTeam));
    }

    public static void displayAge(int[] age) {
        for (int player : age) {
            System.out.print(player + ", ");
        }
    }

    public static double arithmeticsAge(int[] teamAges) {
        double sum = 0;
        for (int age : teamAges) {
            sum = sum + age;
        }
        return sum / teamAges.length;
    }

    public static int[] randomPlayersAges(int teamSize) {
        int[] ages = new int[teamSize];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = ThreadLocalRandom.current().nextInt(18, 41);
        }
        return ages;
    }
}
