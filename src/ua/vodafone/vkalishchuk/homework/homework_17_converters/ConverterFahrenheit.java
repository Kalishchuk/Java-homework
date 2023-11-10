package ua.vodafone.vkalishchuk.homework.homework_17_converters;

public class ConverterFahrenheit extends Converter {
    private static final int FIRST_FAHRENHEIT_CONST = 32;
    private static final double SECOND_FAHRENHEIT_CONST = 1.8;
    public ConverterFahrenheit() {
        super("℉");
    }

    @Override
    public double toCelsius(double temperature) {
        return (temperature - FIRST_FAHRENHEIT_CONST) / SECOND_FAHRENHEIT_CONST;
    }

    @Override
    public double fromCelsius(double temperature) {
        return SECOND_FAHRENHEIT_CONST * temperature + FIRST_FAHRENHEIT_CONST;
    }
}


