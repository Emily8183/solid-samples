package memento;

public class Originator {

    private String content;

    // public Originator(String content) {
    //     this.content = content;
    // }


    public void setContent(String content) {
        this.content = content;
        System.out.println("Current content set to: " + content);
    }

    public String getContent() {
        return content;
    }

    public Memento createState() {
        return new Memento(content);
    }

    public void restore(Memento memento) {
        if (memento == null) {
            System.out.println("No previous state to restore.");
            return;
        }
        content = memento.getContent();
        System.out.println("Restored content to: " + content);
    }
    
}
