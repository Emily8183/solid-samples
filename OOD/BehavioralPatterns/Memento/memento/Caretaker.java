package memento;

import java.util.Stack;

public class Caretaker {

    private Stack<Memento> mementoHistory = new Stack<>();

    public void addState(Memento memento) {
        mementoHistory.push(memento);
    }

    public Memento remove() {

        if (mementoHistory.isEmpty()) return null;

        return mementoHistory.pop();

    }
    
}
