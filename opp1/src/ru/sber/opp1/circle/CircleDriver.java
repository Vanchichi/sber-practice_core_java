package ru.sber.opp1.circle;

public class CircleDriver {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.9, "red");
        Circle circle2 = new Circle(8.2, "yellow");
        System.out.println(circle2.area());
        System.out.println(circle1.perimeter());
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
    }
}
