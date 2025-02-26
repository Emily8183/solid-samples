package memento;

public class Main {
    public static void main(String[] args) {

        Originator originator = new Originator();

        Caretaker caretaker = new Caretaker();

        originator.setContent("a");
        caretaker.addContent(originator.createState());

        originator.setContent("b");
        caretaker.addContent(originator.createState());

        originator.setContent("c");
        caretaker.addContent(originator.createState());
        
        originator.restore(caretaker.remove());
        originator.restore(caretaker.remove());
       
        // System.out.println(originator.getContent());
        
    }

}
