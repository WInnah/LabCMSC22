
import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Winnah Gwen Acal, Mary Danielle Amore, Danielle Hernandez on 10/3/2016.
 */
public class ShapeTest {
    public static void main(String[] mary){
        Shape sheep = new Circle(3.5, "black", true);
        Shape box = new Rectangle(2.0, 3.0, "blue", true);
        Rectangle root = new Square(2.0, "scarlet", true);

        //testing the Circle
        System.out.println(sheep.getColor());
        System.out.println(sheep.isFilled());
        System.out.println(sheep);
        System.out.println( "Radius: " + ((Circle)sheep).getRadius());
        System.out.println( "Area: " + ((Circle)sheep).getArea());
        System.out.println( "Perimeter: " + ((Circle)sheep).getPerimeter());
        sheep.setColor("white");
        sheep.setFilled(false);
        ((Circle)sheep).setRadius(4.7);
        System.out.println(sheep);
        System.out.println( "Area: " + ((Circle)sheep).getArea());
        System.out.println( "Perimeter: " + ((Circle)sheep).getPerimeter() + "\n");

        //testing Rectangle
        System.out.println(box.getColor());
        System.out.println(box.isFilled());
        System.out.println(box);
        System.out.println("Width: " + ((Rectangle)box).getWidth());
        System.out.println("Length: " + ((Rectangle)box).getLength());
        System.out.println("Area: " + ((Rectangle) box).getArea());
        System.out.println("Perimeter: " + ((Rectangle) box).getPerimeter());
        ((Rectangle) box).setWidth(3.0);
        ((Rectangle) box).setLength(4.0);
        System.out.println(box);
        System.out.println("Area: " + ((Rectangle) box).getArea());
        System.out.println("Perimeter: " + ((Rectangle) box).getPerimeter() + "\n");

        //testing Square
        System.out.println(root.getColor());
        System.out.println(root.isFilled());
        System.out.println(root);
        System.out.println("Side: " + (((Square)root).getSide()));
        System.out.println("Area: " + (root.getArea()));
        System.out.println("Perimeter: " + (root.getPerimeter()));
        root = new Square(3.0);
        System.out.println(root);
        System.out.println("Side: " + (((Square)root).getSide()));
        System.out.println("Area: " + (root.getArea()));
        System.out.println("Perimeter: " + (root.getPerimeter()));
    }
}
