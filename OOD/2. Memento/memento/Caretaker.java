package memento;

import java.util.ArrayList;
import java.util.List;

import memento.Memento;

public class Caretaker {

    private List<Memento> mementoHistory = new ArrayList<>();

    public void addContent(Memento memento) {
        mementoHistory.add(memento);
    }

    public Memento remove() {
        int lastIndex = mementoHistory.size() - 1;
        Memento lastContent = mementoHistory.get(lastIndex);

        mementoHistory.remove(lastContent);

        return lastContent;

    }
    
}
