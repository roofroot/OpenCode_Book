package cn.open.book.base.national.datastruct

class Tree<T>: IteratorInterface<T>, TreeStructInterface<T> {
    override fun next(): T {
        TODO("Not yet implemented")
    }

    override fun previous(): T {
        TODO("Not yet implemented")
    }

    override fun hasNext(): Boolean {
        TODO("Not yet implemented")
    }

    override fun listAll(): ListStructInterface<T> {
        TODO("Not yet implemented")
    }

    override fun getChildren(parent: T): ListStructInterface<T> {
        TODO("Not yet implemented")
    }

    override fun hasChild(parent: T): Boolean {
        TODO("Not yet implemented")
    }

    override fun insertChild(parent: T, child: T) {
        TODO("Not yet implemented")
    }

}