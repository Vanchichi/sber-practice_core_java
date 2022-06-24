package ru.sber.opp2;

public class Square extends Figure{
    private int a;
    private int b;
    public Square(Point point,int a){
        super(point);
        this.a=a;
        this.b=a;
    }
    @Override
    public void draw(){
        draw(Color.YELLOW);
    }
    @Override
    public void draw(Color color){
        System.out.println(String.format("A square with a  coordinate:%s,%s side:%s and a color:%s%n", point.x,point.y, a, color));
    }

    @Override
    public double area() {
        return a*a;
    }

    @Override
    public double perimeter() {
        return 4*a;
    }
}
