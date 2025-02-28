package rectanglesquarearea;

public class AreaCalculation {

    public static void main(String[] args) {
        //Method 1: it works
        Shape rectangle = new Rectangle(5,4);
        System.out.println("Area: " + rectangle.calculateArea());

        //如果需要调回rectangle class，为了access rectangle的method，可以用cast
        // Rectangle rectangle2 = (Rectangle) rectangle;

    }

}
