package cn.open.book.base.national.datastruct;

public interface NodeListInterface<T> {


    NodeStruct<T> getLast();

    NodeStruct<T> getFirst();

    void insert(NodeStruct<T> node1,NodeStruct<T> node2);

    int getSize();

}
