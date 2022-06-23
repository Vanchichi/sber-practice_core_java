package ru.sber.opp1.phone;

public class PhoneDriver {
    public static void main(String[] args) {
        Phone Apple = new Phone("+7 921 123 67 67","iphone 13",0.212);
        Phone Samsung = new Phone("+7 900 123 39 90","SE10",0.180);
        Phone Honor = new Phone("+7 911 453 13 67", "8A Prime",0.269);
        Phone Xiaomi = new Phone("+7 900 345 79 45","Redmi 10C",0.283);
        Phone Nokia = new Phone("+7 921 789 05 62","XR20");
        Phone Aurora = new Phone();
        Apple.receiveCall("Влад");
        System.out.println(Samsung.getNumber());
        Aurora.sendMessage(new String[]{"+7 921 123 67 67","+7 900 123 39 90","+7 911 453 13 67","+7 900 345 79 45"});
        System.out.println(Honor.toString());
        System.out.println(Xiaomi.toString());
        System.out.println(Nokia.toString());
    }

}
