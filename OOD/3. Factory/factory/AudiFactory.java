public class AudiFactory implements Factory{
    @Override
    public Audi getCar() {
        return new Audi();
    }

}
