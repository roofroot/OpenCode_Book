package cn.open.book.base.national.datastruct

/**
 * 用于遍历结构
 */
open interface IteratorInterface<T> {
    fun next(): T
    fun previous(): T
    fun hasNext(): Boolean
    fun listAll(): ListStructInterface<T>
}

/**
 * 列表结构
 */
open interface ListStructInterface<T> {
    fun next(): T
    fun previous(): T
    fun get(pos: Int): T
    fun add(element: T): Int
    fun insert(pos: Int): T
}

/**
 * 树形结构
 */
open interface TreeStructInterface<T> {
    fun getChildren(parent: T): ListStructInterface<T>
    fun hasChild(parent: T): Boolean
    fun insertChild(parent: T, child: T)
}
