package memento;

public class Originator {

    private String content;

    // public Originator(String content) {
    //     this.content = content;
    // }


    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public Memento createState() {
        return new Memento(content);
    }

    public void restore(Memento memento) {
        content = memento.getContent();
        System.out.println("Restored content to" + content);
    }
    
}
