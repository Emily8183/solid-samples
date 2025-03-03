package memento;

public class Main {
    public static void main(String[] args) {

        Originator originator = new Originator();

        Caretaker caretaker = new Caretaker();

        originator.setstate("a");
        caretaker.addState(originator.createState());

        originator.setstate("b");
        caretaker.addState(originator.createState());

        originator.setstate("c");

        originator.restore(caretaker.remove());
        // originator.restore(caretaker.remove());

        // System.out.println(originator.getContent());
        
    }

}
