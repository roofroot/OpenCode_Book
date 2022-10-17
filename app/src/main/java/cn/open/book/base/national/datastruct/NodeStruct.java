package cn.open.book.base.national.datastruct;

public class NodeStruct<B> implements NodeStructInterface<NodeStruct<B>, B> {
    private B b;

    private NodeStruct<B> next;


    public NodeStruct(B b) {
        this.b = b;
    }

    public void NodeStruct(B b) {
        this.b = b;
    }

    public void delete() {
        b = null;
        next = null;
    }


    @Override
    public void addNext(NodeStruct<B> bNodeStruct) {
        next = bNodeStruct;
    }

    @Override
    public B node() {
        return b;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public NodeStruct<B> getNext() {
        return next;
    }
}
