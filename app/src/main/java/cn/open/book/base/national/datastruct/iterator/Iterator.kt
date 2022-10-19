package cn.open.book.base.national.datastruct.iterator

import cn.open.book.base.national.datastruct.nodelist.TwoWayNodeListStruct
import cn.open.book.base.national.datastruct.nodelist.TwoWayNodeStruct
import cn.open.book.base.national.datastruct.tree.TreeException

/**
 * 迭代器接口
 */
interface IteratorInterface<T,B:IteratorInterface<T,B>> {
    fun iterator(node: B)
}

/**
 * 基础迭代器，使用nodelist 包中的TwoWayNodeListStruct作为存储数据类型
 */
abstract class BasicIterator<T> : IteratorInterface<T,BasicIterator<T>> {
    var iteratorList: TwoWayNodeListStruct<T> = TwoWayNodeListStruct()
    override fun iterator(node: BasicIterator<T>) {
        if (check(node)) {
            if (node.getNode() != null) {
                System.out.println("addToList:" + node.getNode())
                iteratorList.addToLast(TwoWayNodeStruct(node.getNode()))
            }
        } else {
            throw TreeException(TreeException.METHOD_INPUT_CLASS_CASE_EXECEPTION)
        }
    }

    fun toList(): TwoWayNodeListStruct<T> {
        iterator(this)
        return iteratorList
    }

    abstract fun getNode(): T

    abstract fun check(node: IteratorInterface<T,BasicIterator<T>>): Boolean
}
