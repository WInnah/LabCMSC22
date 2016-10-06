/**
 * Created by Winnah Gwen Acal on 10/5/2016.
 */
public class Triangle extends Shape{
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(){

    }

    public Triangle(double sideOne, double sideTwo, double sideThree){
        if (((sideTwo + sideThree) <= sideOne) || ((sideOne + sideThree) <= sideTwo) || ((sideOne + sideTwo) <= sideThree)){
            throw new IllegalArgumentException("Invalid Inputs.");
        }
        else {
            this.sideOne = sideOne;
            this.sideTwo = sideTwo;
            this.sideThree = sideThree;
        }
    }

    public Triangle(double sideOne, double sideTwo, double sideThree, String color, boolean filled){
        super(color, filled);
        if (((sideTwo + sideThree) <= sideOne) || ((sideOne + sideThree) <= sideTwo) || ((sideOne + sideTwo) <= sideThree)){
            throw new IllegalArgumentException("Invalid Inputs.");
        }
        else {
            this.sideOne = sideOne;
            this.sideTwo = sideTwo;
            this.sideThree = sideThree;
        }
    }

    public void setSideOne(double sideOne){
        this.sideOne = sideOne;
    }

    public double getSideOne(){
        return sideOne;
    }

    public void setSideTwo(double sideTwo){
        this.sideTwo = sideTwo;
    }

    public double getSideTwo(){
        return sideTwo;
    }

    public void setSideThree(double sideThree){
        this.sideThree = sideThree;
    }

    public double getSideThree(){
        return sideThree;
    }

    protected double getPerimeter(){
        return sideOne + sideTwo + sideThree;
    }

    protected double getArea(){
        double p = (getPerimeter())/2;
        return Math.sqrt(p*(p-sideOne)*(p-sideTwo)*(p-sideThree));
    }

    @Override
    public String toString(){
        return String.format("A triangle with sides %.2f, %.2f, %.2f which is a subclass of \n", sideOne, sideTwo, sideThree) + super.toString();
    }
}
