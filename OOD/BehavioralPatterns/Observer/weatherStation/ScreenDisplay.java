public class ScreenDisplay implements Observer{

    private String name;

    public ScreenDisplay (String displayName) {
        this.name = displayName;
    }

    @Override
    public void update(float temp) {
        System.out.println("The temp displayed on " + name + " is " + temp);
    }

}
