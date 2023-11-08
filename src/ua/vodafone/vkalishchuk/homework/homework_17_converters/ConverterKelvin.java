package ua.vodafone.vkalishchuk.homework.homework_17_converters;

public class ConverterKelvin extends Converter {
    private static final double KELVIN_CONST = 273.15;
    public ConverterKelvin() {
        super("K");
    }

    @Override
    public double toCelsius(double temperature) {
        return temperature - KELVIN_CONST;
    }

    @Override
    public double fromCelsius(double temperature) {
        return temperature + KELVIN_CONST;
    }
}
