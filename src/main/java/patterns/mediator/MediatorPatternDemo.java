package patterns.mediator;

// 测试代码
public class MediatorPatternDemo {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague colleagueA = new ConcreteColleagueA(mediator);
        Colleague colleagueB = new ConcreteColleagueB(mediator);

        ((ConcreteMediator) mediator).setColleagueA(colleagueA);
        ((ConcreteMediator) mediator).setColleagueB(colleagueB);

        colleagueA.send("Hello, colleague B.");
        colleagueB.send("Hi, colleague A.");
    }
}