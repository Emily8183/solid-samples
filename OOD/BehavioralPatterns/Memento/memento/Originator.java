package memento;

public class Originator {

    private String state;

    // public Originator(String state) {
    //     this.state = state;
    // }

    public void setstate(String state) {
        this.state = state;
        System.out.println("Current state set to: " + state);
    }

    public String getstate() {
        return state;
    }

    public Memento createState() {
        return new Memento(state); //存储当前状态至Memento
    }

    public void restore(Memento memento) {
        if (memento == null) {
            System.out.println("No previous state to restore.");
            return;
        }
        this.state = memento.getState(); //从 Memento 恢复状态
        System.out.println("Restored state to: " + state);
    }
    
}
