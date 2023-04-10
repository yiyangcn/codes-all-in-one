package patterns.memento;

// 备忘录类
class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

// 发起人类
class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    // 创建备忘录
    public Memento createMemento() {
        return new Memento(state);
    }

    // 恢复状态
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }
}

// 管理者类
class Caretaker {
    private Memento memento;

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }
}

// 测试代码
public class MementoPatternDemo {
    public static void main(String[] args) {
        // 创建发起人和管理者对象
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // 设置发起人状态并创建备忘录
        originator.setState("State 1");
        caretaker.setMemento(originator.createMemento());

        // 修改发起人状态并输出
        originator.setState("State 2");
        System.out.println("Current state: " + originator.getState());

        // 恢复发起人状态并输出
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("Restored state: " + originator.getState());
    }
}
