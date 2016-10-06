
/**
 * Created by Winnah Gwen Acal, Mary Danielle Amore, Danielle Hernandez on 10/3/2016.
 */
public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;

    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2* Math.PI*radius;
    }
    @Override
    public String toString(){
        return String.format("A circle with a radius of %.2f, which is a subclass of \n",radius) + super.toString();
    }

}
