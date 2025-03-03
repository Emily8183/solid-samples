package OOD.CreationalPatterns.Factory.basicfactory;

public class TransportService {
    public static void main(String[] args) {
        Transport transport = TransportFactory.createTransport("bus");
        transport.run();
    }

}
