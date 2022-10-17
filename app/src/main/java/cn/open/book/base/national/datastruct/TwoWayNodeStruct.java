package cn.open.book.base.national.datastruct;

public class TwoWayNodeStruct<T> implements NodeStructInterface<TwoWayNodeStruct<T>, T> {
    private T t;
    private TwoWayNodeStruct<T> prev;

    private TwoWayNodeStruct<T> next;

    public TwoWayNodeStruct(T t) {
        this.t = t;
    }

    public boolean hasPrev() {
        return prev != null;
    }

    public TwoWayNodeStruct<T> getPrev() {
        return prev;
    }

    public void addPrev(TwoWayNodeStruct<T> node) {
        this.prev = node;
    }

    @Override
    public void addNext(TwoWayNodeStruct<T> tTwoWayNodeStruct) {
        next = tTwoWayNodeStruct;
    }

    @Override
    public T node() {
        return t;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public TwoWayNodeStruct<T> getNext() {
        return next;
    }

    @Override
    public void delete() {
        t = null;
        next = null;
        prev = null;
    }
}
