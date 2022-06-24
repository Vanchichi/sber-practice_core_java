package ru.sber.opp2;
public class Cicle extends Figure{
    private int r;
    public Cicle(Point point,int r){
        super(point);
        this.r=r;
    }
    @Override
    public void draw(){
        draw(Color.BLACK);
    }
    @Override
    public void draw(Color color){
        System.out.println(String.format(" A circle with a coordinate:%s %s, with a radius:%s, and color:%s%n", point.x,point.y, r, color));
    }
    @Override
    public double area(){
        return 3.14*r*r;
    }
    @Override
    public double perimeter(){
        return 2*3.14*r;
    }
}
