//since this is a square, can change width to "side"
// if (side <= 0) throw new IllegalArgumentException();

package rectanglesquarearea;

public class Square extends Shape{
    protected int width;

    public Square(int width) {
        this.width = width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    @Override
    public int calculateArea() {
        return width * width;
    }

}
