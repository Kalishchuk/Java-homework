package ua.vodafone.vkalishchuk.homework.homework_17_converters;

import java.util.Scanner;

public abstract class ConverterRunner {
    private static final double EPSILON = 0.00001;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Converter[] converters = {
                new ConverterKelvin(),
                new ConverterFahrenheit()
        };

        System.out.print("Enter temperature in °C: ");
        double temperature = scanner.nextDouble();

        for (Converter converter : converters) {
            example(temperature, converter);
            System.out.println();
        }
    }

    public static void example(double celsius, Converter converter) {
        System.out.printf("Convert from %s to %s\n", converter.celsiusSign(), converter.temperatureSign());
        double convertedValue = converter.fromCelsius(celsius);
        System.out.printf("\t%.2f%s == %.2f%s\n", celsius, converter.celsiusSign(), convertedValue, converter.temperatureSign());

        System.out.println("Reverse conversion:");
        double reverseValue = converter.toCelsius(convertedValue);
        System.out.printf("\t%.2f%s == %.2f%s\n", convertedValue, converter.temperatureSign(), reverseValue, converter.celsiusSign());
        System.out.println("Reverse conversion result is equal to original temperature: " + isEquals(celsius, reverseValue));
    }

    private static boolean isEquals(double value, double other) {
        return Math.abs(value - other) < EPSILON;
    }
}
