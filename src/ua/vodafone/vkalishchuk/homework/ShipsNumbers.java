package ua.vodafone.vkalishchuk.homework;

public class ShipsNumbers {
    public static void main(String[] args) {
        int shuttle = 0;
        int number = 0;
        int countNumbers = 100;
        while (shuttle < countNumbers) {
            number++;
            String shipNumbers = String.valueOf(number);
            if (shipNumbers.contains("4") || shipNumbers.contains("9")) {
                continue;
            }
                shuttle++;
                System.out.println("Ship number " + shuttle + " = " + shipNumbers);
        }
        System.out.println("Total number of the ships: " + shuttle);
    }
}
