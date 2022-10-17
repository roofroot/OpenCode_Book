package cn.open.book.base.national.datastruct;

public class TwoWayNodeListStruct<T> implements TwoWayNodeListInterface<T> {
    int size;
    private TwoWayNodeStruct<T> first;
    private TwoWayNodeStruct<T> last;

    @Override
    public TwoWayNodeStruct<T> getLast() {
        return last;
    }

    @Override
    public TwoWayNodeStruct<T> getFirst() {
        return first;
    }

    @Override
    public void insert(TwoWayNodeStruct<T> node1, TwoWayNodeStruct<T> node2) {
        if (first == null) {
            first = node1;
        }
        if (node1.hasNext()) {
            node2.addNext(node1.getNext());
        } else {
            last = node2;
        }
        node1.addNext(node2);
        node2.addPrev(node1);
        size++;
    }

    public int safeInsert(TwoWayNodeStruct<T> node1, TwoWayNodeStruct<T> node2) {
        if (node2.hasNext() || node2.hasPrev()) {
            return -1;
        }
        if (node1.hasNext()) {
            node2.addNext(node1.getNext());
        } else {
            last = node2;
        }
        node2.addPrev(node1);
        node1.addNext(node2);
        size++;
        return 0;
    }


    /**
     * 删除该节点后的节点
     *
     * @param node
     */
    public void delete(TwoWayNodeStruct<T> node) {
        TwoWayNodeStruct<T> temp = node;
        while (temp.hasNext()) {
            temp = (TwoWayNodeStruct<T>) node.getNext();
            node.addNext(null);
            node.addPrev(null);
            node.delete();
            size--;
        }
        last = node;
    }

    public void addToLast(TwoWayNodeStruct<T> node) {
        if (last == null) {
            if (first == null) {
                first = node;
            } else {
                node.addPrev(first);
            }
            first.addNext(node);
        } else {
            last.addNext(node);
            node.addPrev(last);
        }
        last = node;
        size++;
    }

    @Override
    public int getSize() {
        return size;
    }
}
