public class Client {

    public static void main(String[] args) {
        Car new_audi = new AudiFactory().getCar();
        Car new_BYD = new BYDFactory().getCar();

        new_audi.run();
        new_BYD.run();
    }

}
