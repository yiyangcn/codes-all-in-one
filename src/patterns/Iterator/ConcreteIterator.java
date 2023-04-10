package patterns.Iterator;

// 具体迭代器
class ConcreteIterator<T> implements MyIterator<T> {
    private final T[] elements;
    private int current;

    ConcreteIterator(T[] elements) {
        this.elements = elements;
        current = 0;
    }

    @Override
    public boolean hasNext() {
        return current < elements.length;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new RuntimeException("No more elements.");
        }
        T element = elements[current];
        current++;
        return element;
    }
}
