package ua.vodafone.vkalishchuk.homework;

import java.util.concurrent.ThreadLocalRandom;
public class Rugby {
    public static void main(String[] args) {
        int countPlayers = 25;

        System.out.print("Ages first team:  ");
        int[] firstTeam = randomPlayersAges(countPlayers);
        System.out.println();
        System.out.print("Ages second team: ");
        int[] secondTeam = randomPlayersAges(countPlayers);

        System.out.println();
        System.out.printf("Arithmetics age first team = %.2f", arithmeticsAge(firstTeam));
        System.out.println();
        System.out.printf("Arithmetics age second team = %.2f ", arithmeticsAge(secondTeam));

    }

    public static double arithmeticsAge(int[] team) {
        double sum = 0;
        for (int num : team) {
            sum = sum + num;
        }
        return sum / team.length;
    }

    public static int[] randomPlayersAges(int team) {
        int[] ages = new int[team];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = ThreadLocalRandom.current().nextInt(18, 41);
            System.out.print(ages[i] + "\t");
        }
        return ages;
    }
}
