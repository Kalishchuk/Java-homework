package ua.vodafone.vkalishchuk.homework.homework_13;

public class PersonRunner {
    public static void main(String[] args) {

        Person firstPerson = new Person();
        firstPerson.name = "Will";
        firstPerson.surname = "Smith";
        firstPerson.city = "New York";
        firstPerson.phone = "2936729462846";

        Person secondPerson = new Person();
        secondPerson.name = "Jackie";
        secondPerson.surname = "Chan";
        secondPerson.city = "Shanghai";
        secondPerson.phone = "12312412412";

        Person thirdPerson = new Person();
        thirdPerson.name = "Sherlock";
        thirdPerson.surname = "Holmes";
        thirdPerson.city = "London";
        thirdPerson.phone = "37742123513";

        System.out.println(firstPerson.personInfo("Will", "Smith", "New York", "2936729462846"));
        System.out.println(secondPerson.personInfo("Jackie", "Chan", "Shanghai", "12312412412"));
        System.out.println(thirdPerson.personInfo("Sherlock", "Holmes", "London", "37742123513"));


    }
}
