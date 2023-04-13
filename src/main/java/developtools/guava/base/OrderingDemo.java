package developtools.guava.base;

import com.google.common.collect.Ordering;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrderingDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(-1);
        List<Integer> list1 = new ArrayList<>();
        // 使用ordering 获取 排序比较器 省略new comparator步骤
        Ordering<Integer> comparator = Ordering.natural();
        list.sort(comparator);
        System.out.println(list);
    }
}
