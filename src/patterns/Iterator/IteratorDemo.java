package patterns.Iterator;

// 客户端代码
public class IteratorDemo {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Emma"};
        ConcreteAggregate<String> aggregate = new ConcreteAggregate<>(names);
        MyIterator<String> iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}