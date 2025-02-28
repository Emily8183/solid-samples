//problem: interface shouldnt be forced to complete

public interface Worker {
    void work();
    void eat();
}

public class Robot implements Worker {
    public void work() {
        System.out.println("Robot is working...");
    }

    public void eat() {
        throw new UnsupportedOperationException("Robots don't eat!");
    }
}

