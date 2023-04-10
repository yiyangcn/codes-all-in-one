package patterns.Iterator;

// 具体聚合类
class ConcreteAggregate<T> implements MyAggregate<T> {
    private final T[] elements;

    ConcreteAggregate(T[] elements) {
        this.elements = elements;
    }

    @Override
    public MyIterator<T> createIterator() {
        return new ConcreteIterator<>(elements);
    }
}