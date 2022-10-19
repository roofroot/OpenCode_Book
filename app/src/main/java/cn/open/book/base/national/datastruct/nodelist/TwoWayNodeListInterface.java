package cn.open.book.base.national.datastruct.nodelist;

public interface TwoWayNodeListInterface<T> {
    TwoWayNodeStruct<T> getLast();

    TwoWayNodeStruct<T> getFirst();

    void insert(TwoWayNodeStruct<T> node1, TwoWayNodeStruct<T> node2);

    int getSize();

}
