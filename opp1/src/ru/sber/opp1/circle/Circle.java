package ru.sber.opp1.circle;

public class Circle {
    private double radius;
    private String color;
    public Circle(double radius,String color) {
        this.radius = radius;
        this.color = color;
    }
    public double area(){
        return 3.14*radius*radius;
    }
    public double perimeter (){
        return 2*3.14*radius;
    }
    public String toString(){
        return(String.format("radius %s color %s area %s perimeter %s",radius,color,area(),perimeter()));
    }
}
