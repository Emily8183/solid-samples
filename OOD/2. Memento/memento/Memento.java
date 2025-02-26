package memento;

//在Memento中存储内容
public class Memento {
    private final String state; //保存状态

    public Memento(String state) {
        this.state = state; //构造时存入状态
    }

    public String getState() {
        return state; //允许获取状态，但不能修改
    }

}
