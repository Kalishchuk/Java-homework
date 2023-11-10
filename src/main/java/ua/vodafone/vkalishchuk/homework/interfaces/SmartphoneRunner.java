package ua.vodafone.vkalishchuk.homework.interfaces;

import java.util.concurrent.ThreadLocalRandom;

public class SmartphoneRunner {
    public static void main(String[] args) {
        Smartphones[] smartphones = {
                new Android(),
                new Android(),
                new Iphones(),
                new Android(),
                new Iphones()
        };

        for (int i = 0; i < smartphones.length; i++) {
            String phoneNumber = String.valueOf(ThreadLocalRandom.current().nextLong(1000000000L, 9999999999L));
            System.out.println("\tWork with smartphone#" + i);
            smartphones[i].call(phoneNumber);
            smartphones[i].sms(phoneNumber, "I tried to call you...");
            smartphones[i].internet();
            System.out.println();
        }

        ((Linux)smartphones[1]).enableRootMode();
        ((Linux)smartphones[3]).disableRootMode();

        ((Ios)smartphones[2]).askSiri("To be or not to be?");
    }
}

