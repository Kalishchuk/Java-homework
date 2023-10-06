package ua.vodafone.vkalishchuk.homework;

public class Draft1 {
    public static void main(String[] args) {

        int порядковийНомер = 0;
        for ( int cikle = 1 ; cikle < 101;) {
            String numbers = String.valueOf(++порядковийНомер);
             if ((numbers.contains("4") || numbers.contains("9")))continue;

            {  System.out.println("Ship number " + cikle + " = " + порядковийНомер);
                ++cikle;

            }
            System.out.println(cikle);


        }
        //System.out.println("Total " + (цикл - 1));
    }
}