public class Client {

    public static void main(String[] args) {
        //方法一（更优化）：
        Factory audi_factory = new AudiFactory();
        Car audi_car = audi_factory.getCar();
        audi_car.run();

        //方法二：
        //Car new_audi = new AudiFactory().getCar();
        // Car new_BYD = new BYDFactory().getCar();

        // new_audi.run();
        // new_BYD.run();
    }

}
