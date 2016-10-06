import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Winnah Gwen Acal, Mary Danielle Amore, Danielle Hernandez on 10/3/2016.
 */
public class ShapeTest {
    public static void main(String[] mary) {
        Shape sheep = new Circle(3.5, "black", true);
        Shape box = new Rectangle(2.0, 3.0, "blue", true);
        Shape root = new Square(2.0, "scarlet", true);
        Shape three = new Triangle(2.0, 3.0, 4.0, "gold", true);

        //testing the Circle
        System.out.println(sheep);
        System.out.println("Radius: " + ((Circle) sheep).getRadius());
        System.out.println("Area: " + ((Circle) sheep).getArea());
        System.out.println("Perimeter: " + ((Circle) sheep).getPerimeter());
        sheep.setColor("white");
        sheep.setFilled(false);
        ((Circle) sheep).setRadius(4.7);
        System.out.println(sheep);
        System.out.println("Area: " + ((Circle) sheep).getArea());
        System.out.println("Perimeter: " + ((Circle) sheep).getPerimeter() + "\n");

        //testing Rectangle
        System.out.println(box);
        System.out.println("Width: " + ((Rectangle) box).getWidth());
        System.out.println("Length: " + ((Rectangle) box).getLength());
        System.out.println("Area: " + ((Rectangle) box).getArea());
        System.out.println("Perimeter: " + ((Rectangle) box).getPerimeter());
        ((Rectangle) box).setWidth(3.0);
        ((Rectangle) box).setLength(4.0);
        System.out.println(box);
        System.out.println("Area: " + ((Rectangle) box).getArea());
        System.out.println("Perimeter: " + ((Rectangle) box).getPerimeter() + "\n");

        //testing Square
        System.out.println(root);
        System.out.println("Side: " + ((Square) root).getSide());
        System.out.println("Area: " + ((Square) root).getArea());
        System.out.println("Perimeter: " + ((Square) root).getPerimeter());
        root = new Square(3.0);
        System.out.println(root);
        System.out.println("Side: " + ((Square) root).getSide());
        System.out.println("Area: " + ((Square) root).getArea());
        System.out.println("Perimeter: " + ((Square) root).getPerimeter());

        //testing Triangle
        System.out.println(three.getColor());
        System.out.println(three.isFilled());
        System.out.println(three);
        System.out.println("Side 1: " + ((Triangle) three).getSideOne());
        System.out.println("Side 2: " + ((Triangle) three).getSideTwo());
        System.out.println("Side 3: " + ((Triangle) three).getSideThree());
        System.out.println("Perimeter: " + ((Triangle) three).getPerimeter());
        System.out.println("Area: " + ((Triangle) three).getArea());
/*
//Part two
        Shape s1 = new Circle(5.5, "RED", false);  // Upcast Circle to Shape
        System.out.println(s1);                    // which version?
        System.out.println(((Circle)s1).getArea());          // which version?
        System.out.println(((Circle)s1).getPerimeter());     // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(((Circle)s1).getRadius());

        Circle c1 = (Circle)s1;                   // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape();

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);   // Upcast
        System.out.println(s3);
        System.out.println(((Rectangle)s3).getArea());
        System.out.println(((Rectangle)s3).getPerimeter());
        System.out.println(s3.getColor());
        System.out.println(((Rectangle)s3).getLength());

        Rectangle r1 = (Rectangle)s3;   // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);     // Upcast
        System.out.println(s4);
        System.out.println(((Square)s4).getArea());
        System.out.println(s4.getColor());
        System.out.println(((Square)s4).getSide());

// Take note that we downcast Shape s4 to Rectangle,
//  which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(((Square)r2).getSide());
        System.out.println(r2.getLength());

// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());


    */
    }
}