package Moving;

/**
 * Created by Danielle98 on 10/10/2016.
 */
public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    public void moveUp(){
        topLeft.moveUp();
        bottomRight.moveUp();
    }
    public void moveDown(){
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    public void moveLeft(){
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
    public void moveRight(){
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public String toString(){
        return topLeft.toString() + bottomRight.toString();
    }



}
