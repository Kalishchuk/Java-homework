package ua.vodafone.vkalishchuk.homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Draft {
    public static void main(String[] args) {

      // String[] numbers = new String[200];
        int цикл = 1;
        int порядковийНомер = 0;
        while (цикл < 101) {
            String chislo = String.valueOf(++порядковийНомер);
            if ((chislo.contains("4") || chislo.contains("9"))) continue;
            System.out.println("Ship number " + цикл + " = " + порядковийНомер);
            цикл++;
            System.out.println(цикл);
        }
        System.out.println("Total " + (цикл - 1));
        System.out.println();
    }
}
