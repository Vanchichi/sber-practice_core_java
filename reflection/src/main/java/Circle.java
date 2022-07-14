public class Circle {
    public double radius;
    protected String color;
    private String name;

    public Circle(double radius,String color,String name) {
        this.radius = radius;
        this.color = color;
        this.name=name;
    }
    private double area(){
        return 3.14*radius*radius;
        }
    private double perimeter (){
        return 2*3.14*radius;
        }
    public String toString(){
        return(String.format("name %s radius %s color %s area %s perimeter %s",name,radius,color,area(),perimeter()));
        }
}
