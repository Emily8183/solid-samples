package carsengine;

public class Client {

    public static void main(String[] args) {

        ElectricEngine electricEngine = new ElectricEngine();
        Car electricCar = new Car(electricEngine);

        electricCar.start();
    }
}
