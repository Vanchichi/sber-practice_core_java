package ru.sber.opp2;

public class PaintExample {
    public static void main(String[] args) {
        Figure circle = new Cicle(new Point(8, 6), 4);
        Figure square = new Square(new Point(4, 2), 2);
        Figure rectangle = new Rectangle(new Point(-2, -4), 3, 4);
        Figure triangle = new Triangle(new Point(-6, -8), 3, 4, 5);

        FigureUnil.draw(circle);
        FigureUnil.draw(circle, Color.BLACK);
        FigureUnil.draw(square);
        FigureUnil.draw(square, Color.PINK);
        FigureUnil.draw(rectangle);
        FigureUnil.draw(rectangle, Color.GREEN);
        FigureUnil.draw(triangle);
        FigureUnil.draw(triangle, Color.ORANGE);

        System.out.println(String.format("Area circle = %s", FigureUnil.area(circle)));
        System.out.println(String.format("Perimeter circle = %s",FigureUnil.perimeter(circle)));
        System.out.println(String.format("Area square = %s", FigureUnil.area(square)));
        System.out.println(String.format("Perimeter square = %s",FigureUnil.perimeter(square)));
        System.out.println(String.format("Area rectangle = %s",FigureUnil.area(rectangle)));
        System.out.println(String.format("Perimeter rectangle = %s",FigureUnil.perimeter(rectangle)));
        System.out.println(String.format("Area triangle = %s",FigureUnil.area(triangle)));
        System.out.println(String.format("Perimeter triangle = %s",FigureUnil.perimeter(triangle)));
    }
}
