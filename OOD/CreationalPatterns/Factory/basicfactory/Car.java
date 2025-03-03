package OOD.CreationalPatterns.Factory.basicfactory;

public class Car implements transport{
    @Override
    public void run() {
        System.out.println("Car is running");
    }

}