
/**
 * Created by Winnah Gwen Acal, Mary Danielle Amore, Danielle Hernandez on 10/3/2016.
 */
public abstract class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape (){
        this("green", true);
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        if (filled){
            return "A shape with color of " + color + " and filled";
        }else {
            return "A shape with color of " + color + " and not filled";
        }
    }
}
