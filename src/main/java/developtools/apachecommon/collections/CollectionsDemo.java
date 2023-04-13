package developtools.apachecommon.collections;

import org.apache.commons.collections4.list.AbstractLinkedList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

        ConcreteLinkedList<String> concreteLinkedList = new ConcreteLinkedList<>();

        concreteLinkedList.add("test");
        Object[] objects = concreteLinkedList.toArray();
        System.out.println(objects.toString());
    }
}
