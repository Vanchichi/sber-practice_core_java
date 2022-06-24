package ru.sber.opp2;

public abstract class Figure implements Drawable {
    protected Point point;
    public Figure(Point point){
        this.point=point;
    }
     public abstract double area();
     public abstract double perimeter();
}
