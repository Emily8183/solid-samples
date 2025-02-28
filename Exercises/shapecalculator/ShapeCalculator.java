
package shapecalculator;

import java.util.ArrayList;
import java.util.List;

public class ShapeCalculator {

    public static void main(String[] args) {
        Shape circle1 = new Circle(10);
        Shape circle2 = new Circle(2);
    
        Shape rectangle = new Rectangle(10, 5);
    
        List<Shape> shapes = new ArrayList<>();
    
        // shapes.add(circle1, circle2, circle2); <= syntax issue, can't add this way!
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(rectangle);
    
        double totalArea = 0; //Java requires explicit initialization for local variables. So can't write "double totalArea", but if it's an instance variable (out of the method), java will auto assign the default value of 0 or null. 
    
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }

        // return totalArea;

        // Print total area instead of returning
        System.out.println("Total Area: " + totalArea);

    
    }

}
