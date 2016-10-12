package Moving;

/**
 * Created by Danielle98 on 10/10/2016.
 */
public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    //Constructor
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }
    public void moveUp(){
        center.moveUp();
    }
    public void moveDown(){
        center.moveDown();
    }
    public void moveLeft(){
        center.moveLeft();
    }
    public void moveRight(){
        center.moveLeft();
    }

    public String toString(){
        return String.format("Radius: %d ", radius) + center.toString();
    }

}
