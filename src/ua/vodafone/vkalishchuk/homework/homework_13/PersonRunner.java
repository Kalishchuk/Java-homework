package ua.vodafone.vkalishchuk.homework.homework_13;

public class PersonRunner {
    public static void main(String[] args) {

        Person firstPerson = new Person();
        firstPerson.setName("Will");
        firstPerson.setSurname("Smith");
        firstPerson.setCity("New York");
        firstPerson.setPhone("2936729462846");

        Person secondPerson = new Person();
        secondPerson.setName("Jackie");
        secondPerson.setSurname("Chan");
        secondPerson.setCity("Shanghai");
        secondPerson.setPhone("12312412412");

        Person thirdPerson = new Person();
        thirdPerson.setName("Sherlock");
        thirdPerson.setSurname("Holmes");
        thirdPerson.setCity("London");
        thirdPerson.setPhone("37742123513");

        System.out.println(firstPerson.personInfo());
        System.out.println(secondPerson.personInfo());
        System.out.println(thirdPerson.personInfo());


    }
}
