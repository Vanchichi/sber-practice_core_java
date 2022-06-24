package ru.sber.opp2;

public class Triangle extends Figure{
    private int a;
    private int b;
    private int c;
    public Triangle(Point point,int a,int b,int c){
        super(point);
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    public void draw(){
        draw(Color.PINK);
    }
    @Override
    public void draw(Color color){
        System.out.println(String.format("A triangle with a coordinate:%s,%s with sides:%s, %s, %s and color:%s%n", point.x,point.y, a, b, c, color));
    }

    @Override
    public double area() {
        return Math.sqrt(perimeter()/2*(perimeter()/2-a)*(perimeter()/2-b)*(perimeter()/2-c));
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }
}
