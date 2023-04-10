package patterns.observer;

// 具体观察者类
class ConcreteObserver implements Observer {
    private final String name;

    ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(int value) {
        System.out.println(name + " received update: " + value);
    }
}