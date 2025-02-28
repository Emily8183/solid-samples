package carsengine;

public class Car {
    // Engine engine;
    private Engine engine; // dont forget the modifier
    
    public Car(Engine engine) {
        this.engine = engine;
    }
    
    public void start() {
        engine.run();
    }

}
