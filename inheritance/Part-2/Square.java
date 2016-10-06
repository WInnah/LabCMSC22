/**
 * Created by Winnah Gwen Acal, Mary Danielle Amore, Danielle Hernandez on 10/3/2016.
 */
public class Square extends Rectangle {
    protected double side;

    public Square(){

    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color,filled);
        this.side = side;
    }

    public void setSide(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }


    @Override
    public double getWidth(){
        return side;
    }
    @Override
    public void setWidth(double side){
        this.side = side;
    }

    @Override
    public double getLength(){
        return side;
    }

    @Override
    public void setLength(double side){
        this.side = side;
    }

    @Override
    protected double getArea() {
        return side*side;
    }

    @Override
    protected double getPerimeter() {
        return 4*side;
    }

    @Override
    public String toString(){
        return String.format("A square with side %.2f, which is a subclass of \n", side) + super.toString();
    }
}
