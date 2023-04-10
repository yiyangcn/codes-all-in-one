package patterns.Iterator;

// 聚合接口
interface MyAggregate<T> {
    MyIterator<T> createIterator();
}