package rectanglesquarearea;

public class Rectangle extends Shape{

    protected int width;
    protected int height;

    //constructor不能忘
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        // super.setWidth(width);//super里没有setWidth()，所以不能这样写
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    // public int calculateArea(int width, int height) { <= Because Rectangle already has width and height as instance variables, so we don’t need to pass them as parameters.
    public int calculateArea() {
        return width * height;
    }

}
