package ua.vodafone.vkalishchuk.homework.getters_setters;

public abstract class FitnesTracker {
    String name;
    int dayOfBirth ;
    int monthOfBirth;
    int yearOfBirth;
    String email;
    int phone;
    String surname;
    double weight;
    double blodPressure;
    int allStepsOnDay;
    int age;

    public void createUser(String name, int dayOfBirth, int monthOfBirth, int yearOfBirth, String email, int phone,
                           String surname, double weight, double blodPressure, int allStepsOnDay, int age) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth =yearOfBirth;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.blodPressure =blodPressure;
        this.allStepsOnDay = allStepsOnDay;
        this.age = calculateAge(yearOfBirth);
    }

    private int calculateAge(int yearOfBirth) {
        int age;
        age = 2020 - yearOfBirth;
        return age;
    }

}
