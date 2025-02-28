package Robots.robots;

// public class Worker implements (Workable, Eatable) { <= WRONG!

public class Worker implements Workable, Eatable {
    public void work() {
        System.out.println("Worker is working...");
    }

    public void eat() {
        System.out.println("Worker is eating...");
    }

}
