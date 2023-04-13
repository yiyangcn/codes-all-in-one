package developtools.guava.base;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class ObjectsDemo {

    public static void main(String[] args) {
        String a = null;
        String b = "123";
        int c = -1;
        int d = 0;
        // 避免为空时报错 return false
        System.out.println(Objects.equal(a, b));
        // return false
        System.out.println(Objects.equal(c, d));

        // return 123{what=c}
        String toString = MoreObjects.toStringHelper(b).add("what", "c").toString();
        System.out.println(toString);


    }
}
