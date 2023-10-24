package ua.vodafone.vkalishchuk.homework.getters_setters;

public class FitnessTrekker {
    private static final int CURRENT_YEAR = 2023;
    private final String name;
    private final int birthDay;
    private final int birthMonth;
    private final int birthYear;
    private final String email;
    private final String phone;
    private String surname;
    private double weight;
    private String pressure;
    private int steps;
    private int age;

    public FitnessTrekker(String name, String surname, int birthDay, int birthMonth, int birthYear, String email, String phone, double weight, String pressure, int steps) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.age = CURRENT_YEAR - this.birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println("FitnessTrekker:" + " name=" + name + ", surname=" + surname + ", birthDay=" + birthDay + ", birthMonth=" +
                birthMonth + ", birthYear=" + birthYear + ", email=" + email + ", phone=" + phone +
                 ", weight=" + weight + ", pressure=" + pressure + ", steps=" + steps + ", age=" + age );
    }
}
