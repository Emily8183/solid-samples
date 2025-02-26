public class MobileDisplay implements Observer{

    private String name;

    public MobileDisplay (String displayName) {
        this.name = displayName;
    }

    @Override
    public void update(float temp) {
        System.out.println("The temp displayed on " + name + "is " + temp);
    }

}
    


