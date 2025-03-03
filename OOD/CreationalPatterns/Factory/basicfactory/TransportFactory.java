package OOD.CreationalPatterns.Factory.basicfactory;

public class TransportFactory {
    public static Transport createTransport(String type) {
        switch(type.toLowerCase()) {
            case "bus":
            return new Bus();

            case "car":
            return new Car();

            case "bike":
            return new Bike();

            default:
                throw new IllegalArgumentException("Unsupported type");
        }
    }


}
