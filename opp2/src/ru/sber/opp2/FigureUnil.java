package ru.sber.opp2;

public class FigureUnil {
    private FigureUnil(){
        //конструктор
    }
    public static double area (Figure figure){
        return figure.area();
    }
    public static double perimeter (Figure figure){
        return figure.perimeter();
    }
    public static void draw (Drawable figure){
        figure.draw();
    }
    public static void draw (Drawable figure, Color color){
        figure.draw(color);
    }
}
