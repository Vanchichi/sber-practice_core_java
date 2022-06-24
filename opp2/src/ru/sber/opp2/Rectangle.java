package ru.sber.opp2;

public class Rectangle extends Figure{
    private int a;
    private   int b;
    public Rectangle(Point point,int a, int b){
        super(point);
        this.a=a;
        this.b=b;
        }

        @Override
        public void draw() {

        }

        @Override
        public void draw(Color color) {
            System.out.println(String.format("A rectangle with a coordinate:%s,%s with sides:%s, %s, and color:%s%n", point.x, point.y, a, b, color));
        }

        @Override
        public double area() {
        return a * b;
        }

        @Override
        public double perimeter() {
        return 0;
    }
}
