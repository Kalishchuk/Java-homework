package ua.vodafone.vkalishchuk.homework.homework_13;

public class Person {
    String name;
    String surname;
    String city;
    String phone;

    public String personInfo(String name, String surname, String city, String phone ){
        this.name =name;
        this.surname =surname;
        this.city =city;
        this.phone = phone;

        return "You can call " + name + " " + surname + " from city " + city +
                " by number phone " + phone;
    }
}
