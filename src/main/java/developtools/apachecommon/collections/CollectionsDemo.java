package developtools.apachecommon.collections;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.collections4.list.AbstractLinkedList;

import java.lang.reflect.Array;
import java.util.*;

/**
 * org.apache.commons.collections – CommonsCollections自定义的一组公用的接口和工具类
 *
 * org.apache.commons.collections.bag – 实现Bag接口的一组类
 *
 * org.apache.commons.collections.bidimap – 实现BidiMap系列接口的一组类
 *
 * org.apache.commons.collections.buffer – 实现Buffer接口的一组类
 *
 * org.apache.commons.collections.collection –实现java.util.Collection接口的一组类
 *
 * org.apache.commons.collections.comparators– 实现java.util.Comparator接口的一组类
 *
 * org.apache.commons.collections.functors –Commons Collections自定义的一组功能类
 *
 * org.apache.commons.collections.iterators – 实现java.util.Iterator接口的一组类
 *
 * org.apache.commons.collections.keyvalue – 实现集合和键/值映射相关的一组类
 *
 * org.apache.commons.collections.list – 实现java.util.List接口的一组类
 *
 * org.apache.commons.collections.map – 实现Map系列接口的一组类
 *
 * org.apache.commons.collections.set – 实现Set系列接口的一组类
 *
 */
public class CollectionsDemo {

    public static void main(String[] args) {
        collectionUtils();
        mapUtils();
    }
    private static void collectionUtils() {
        List<String> list1 = null;
        // 进行空值判断，空或者size==0 返回true
        System.out.println(CollectionUtils.isEmpty(list1));
        // 交集并集 差集
        list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");

        List<String> list2 = new ArrayList<>();
        list2.add("B");
        list2.add("C");
        // 交集
        System.out.println(CollectionUtils.intersection(list1, list2));
        // 并集
        System.out.println(CollectionUtils.union(list1, list2));
        // 差集
        System.out.println(CollectionUtils.subtract(list1, list2));
    }


    private static void mapUtils() {
        Map<String, String> map = new HashMap<>();
        System.out.println(MapUtils.isEmpty(map));
    }
}
