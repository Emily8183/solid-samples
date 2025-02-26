public class BYDFactory implements Factory {
    @Override
    public BYD getCar() {
        return new BYD();
    }

}
