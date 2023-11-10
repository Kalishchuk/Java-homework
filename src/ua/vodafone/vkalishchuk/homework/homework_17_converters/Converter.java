package ua.vodafone.vkalishchuk.homework.homework_17_converters;

public abstract class Converter {
    private static final String CELSIUS = "°C";
    private final String temperatureSign;

    public Converter(String temperatureSign) {
        this.temperatureSign = temperatureSign;
    }

    public final String celsiusSign() {
        return CELSIUS;
    }

    public final String temperatureSign() {
        return temperatureSign;
    }

    public abstract double fromCelsius(double temperature);

    public abstract double toCelsius(double temperature);
}

