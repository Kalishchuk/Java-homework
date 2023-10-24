package ua.vodafone.vkalishchuk.homework.getters_setters;

public class FitnessTrekkerRunner {
    public static void main(String[] args) {


        FitnessTrekker[] fitnessTrekkers = {
                new FitnessTrekker("Volodymyr", "Pupkin", 5, 5, 1885, "volodymyr@gmail.com", "0501223344", 79.5, "150/120", 3012),
                new FitnessTrekker("Dmytro", "Dmytruk", 4, 4, 2004, "dmytro@gmail.com", "0662334455", 64.86, "120/80", 15432),
                new FitnessTrekker("Denis", "Dynysemko", 6, 1, 1854, "denis@gmail.com", "0983445566", 90.45, "130/90", 4305),
                new FitnessTrekker("Ganna", "Ganivna", 6, 1, 1854, "ganna@gmail.com", "0674556677", 90.45, "130/90", 4305)};

        System.out.println("Initial accounts information");
        showInfo(fitnessTrekkers);

        FitnessTrekker volodymyr = fitnessTrekkers[0];
        volodymyr.setSurname("Kalishchuk");
        volodymyr.setSteps(11987);
        volodymyr.setPressure("120/80");



        FitnessTrekker ganna = fitnessTrekkers[2];
        ganna.setWeight(44.94);
        ganna.setSteps(36789);

        System.out.println();
        System.out.println("Accounts information after changing");
        showInfo(fitnessTrekkers);

    }

    private static void showInfo(FitnessTrekker[] fitnessTrekkers) {
        for (FitnessTrekker fitnessTrekker : fitnessTrekkers) {
            fitnessTrekker.printInfo();
        }
    }
}

