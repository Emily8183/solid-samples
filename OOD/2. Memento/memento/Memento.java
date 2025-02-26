package memento;

//在Memento中存储内容
public class Memento {
    private final String content;

    public Memento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
