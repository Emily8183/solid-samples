package memento;

import java.util.Stack;

public class Caretaker {

    private Stack<Memento> mementoHistory = new Stack<>();

    public void addContent(Memento memento) {
        mementoHistory.push(memento);
    }

    public Memento remove() {

        if (mementoHistory.isEmpty()) return null;

        mementoHistory.pop();

        return mementoHistory.get(mementoHistory.size()-1);
    }
    
}
