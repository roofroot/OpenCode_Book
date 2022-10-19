package cn.open.book.base.national.datastruct.nodelist;

public interface NodeStructInterface<T extends NodeStructInterface, B> {
    void addNext(T t);

    B node();

    boolean hasNext();

    T getNext();

    void delete();
}
