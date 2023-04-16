package developtools.guava.base;

import com.google.common.base.Throwables;

public class ThrowablesDemo {

    public static void main(String[] args) {
        testTrowAbles();
    }

    private static void testTrowAbles() {
        try {
            throw new Exception();
        } catch (Throwable t) {
            // 提供抛出异常处理方法
            System.out.println(Throwables.getCausalChain(t));
        }
    }
}
