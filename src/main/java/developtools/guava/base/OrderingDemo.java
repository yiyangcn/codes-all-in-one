package developtools.guava.base;

import com.google.common.collect.Ordering;

import java.util.ArrayList;
import java.util.List;

public class OrderingDemo {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(2);
        intList.add(1);
        intList.add(-1);
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("c");
        stringList.add("B");
        // 使用ordering 获取 排序比较器 省略new comparator步骤
        Ordering<Integer> comparator = Ordering.natural();
        intList.sort(comparator);
        System.out.println(intList);

    }
}
