package ua.vodafone.vkalishchuk.homework.interfaces;

public interface Smartphones {
    void call(String phoneNumber);

    void sms(String phoneNumber, String message);

    void internet();
}
