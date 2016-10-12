package GeoObj;

/**
 * Created by Danielle98 on 10/10/2016.
 */
public class ResizableCircle extends Circle implements Resizable  {

    public ResizableCircle(double radius){
        super(radius);
    }

    public double resize(int percent){
        radius = (radius + ((radius*percent)/100));
        return radius;
    }
}
