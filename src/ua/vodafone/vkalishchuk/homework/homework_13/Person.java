package ua.vodafone.vkalishchuk.homework.homework_13;

public class Person {
    private String name;
    private String surname;
    private String city;
    private String phone;

    //String name, String surname, String city, String phone

    public String personInfo() {
        this.setName(name);
        this.setSurname(surname);
        this.setCity(city);
        this.setPhone(phone);

        return "You can call " + name + " " + surname + " from city " + city +
                " by number phone " + phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
