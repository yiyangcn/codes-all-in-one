package developtools.guava.base;

import com.google.common.base.Preconditions;

public class PreconditionsDemo {
    public static void main(String[] args) {
        String a = null;
        // 直接使用 为空返回value 不为空 报空指针异常
//        System.out.println(Preconditions.checkNotNull(a));
        try {
            Preconditions.checkNotNull(a);
        } catch (Exception e) {
            System.out.println("a为空" );
        }
    }
}
