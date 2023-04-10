package patterns.Iterator;

// 迭代器接口
interface  MyIterator<T> {
    boolean hasNext();
    T next();
}
