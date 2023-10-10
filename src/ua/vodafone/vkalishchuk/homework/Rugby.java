package ua.vodafone.vkalishchuk.homework;

import java.util.concurrent.ThreadLocalRandom;
public class Rugby {
    public static void main(String[] args) {
        int countPlayers = 25;

        System.out.println("Ages first team:  ");
        int[] firstTeam = randomPlayersAges(countPlayers);
        System.out.println();
        System.out.println("Ages second team: ");
        int[] secondTeam = randomPlayersAges(countPlayers);

        System.out.println();
        System.out.printf("Average arithmetic age of players = %.2f", arithmeticsAge(firstTeam));
        System.out.println();
        System.out.printf("Average arithmetic age of players = %.2f ", arithmeticsAge(secondTeam));

    }

    public static double arithmeticsAge(int[] teamAges) {
        double sum = 0;
        for (int num : teamAges) {
            sum = sum + num;
        }
        return sum / teamAges.length;
    }

    public static int[] randomPlayersAges(int teamSize) {
        int[] ages = new int[teamSize];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = ThreadLocalRandom.current().nextInt(18, 41);
            System.out.print(ages[i] + "\t");
        }
        return ages;
    }
}
