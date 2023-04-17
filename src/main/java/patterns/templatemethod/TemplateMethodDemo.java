package patterns.templatemethod;

/**
 * 模板方法模式
 * Define the skeleton of an algorithm in an operation,deferring some steps to subclasses.
 * Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure
 */
/**
 * 模板方法抽象类
 * 1.定义基本操作
 * 2.定义模板方法
 */
abstract class TemplateMethod {

    abstract void doSomething();

    abstract void doAnything();

    /**
     * 钩子方法
     * 有子类决定操作
     */
    protected boolean isDoAnything() {
        return true;
    }

    /**
     * 模板方法
     */
    void template() {
        doSomething();
        if (isDoAnything()) {
            doAnything();
        }

    }
}

/**
 * 实现模板方法
 */
class ImplementTemplateMethod extends TemplateMethod {
    private boolean isDoAnything;
    @Override
    void doSomething() {
        System.out.println("do something");
    }

    @Override
    void doAnything() {
        System.out.println("do anything");
    }

    @Override
    protected boolean isDoAnything() {
        return isDoAnything;
    }

    public void setDoAnything(boolean doAnything) {
        isDoAnything = doAnything;
    }
}

public class TemplateMethodDemo {


    public static void main(String[] args) {
        ImplementTemplateMethod implementTemplateMethod = new ImplementTemplateMethod();
        implementTemplateMethod.setDoAnything(false);
        implementTemplateMethod.template();
    }


}
