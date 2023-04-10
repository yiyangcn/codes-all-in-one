package patterns.interpreter;
// 抽象表达式
interface Expression {
    boolean interpret(String context);
}

// 终结符表达式
class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}

// 非终结符表达式
class OrExpression implements Expression {
    private Expression expr1;
    private Expression expr2;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}

// 非终结符表达式
class AndExpression implements Expression {
    private Expression expr1;
    private Expression expr2;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}

// 环境类
class Context {
    private String context;

    public Context(String context) {
        this.context = context;
    }

    public String getContext() {
        return context;
    }
}

// 测试代码
public class InterpreterPatternDemo {
    public static void main(String[] args) {
        Expression expr1 = new TerminalExpression("hello");
        Expression expr2 = new TerminalExpression("world");
        Expression orExpr = new OrExpression(expr1, expr2);

        Expression expr3 = new TerminalExpression("good");
        Expression expr4 = new TerminalExpression("morning");
        Expression andExpr = new AndExpression(expr3, expr4);

        Context context = new Context("hello world");

        System.out.println(orExpr.interpret(context.getContext())); // true

        context = new Context("good morning");
        System.out.println(andExpr.interpret(context.getContext())); // true
    }
}
