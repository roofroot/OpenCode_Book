package cn.open.book.base.national.datastruct.tree

import cn.open.book.base.national.datastruct.iterator.BasicIterator
import cn.open.book.base.national.datastruct.iterator.IteratorInterface
import java.lang.Exception


/**
 * 二叉树节点接口
 */
interface BinaryNodeInterface<T> {
    fun left(): BinaryNodeInterface<T>?
    fun right(): BinaryNodeInterface<T>?
    fun node(): T?
}

/**
 * 二叉树结构接口
 */
interface TreeStruct<T, B : BinaryNodeInterface<T>> {
    /**
     * @param node1
     * @param node2
     * 用node2替换掉node1的左节点
     */
    fun replaceLeft(node1: B, node2: B)

    /**
     * 用node2替换掉node1的右节点
     */
    fun replaceRight(node1: B, node2: B)

    /**
     * 向node1的左节点插入node2
     * 如果node1的左节点不为空，则继续查找左节点的左节点，直到找到一个空的子节点
     */
    fun insertToLeftLastEmpty(node1: B, node2: B)

    /**
     * 向node1的右节点插入node2
     * 如果node1的右节点不为空，则继续查找右节点的右节点，直到找到一个空的子节点
     */
    fun insertToRightLastEmpty(node1: B, node2: B)

    /**
     * 向node1的节点插入node2
     * 如果node1的左节点不为空，则向node1的右节点插入。
     * 如果右节点不为空，则开始查找右节点的左节点..
     * 以此类推
     * 直到找到一个空的子节点
     */
    fun insertToLastEmpty(node1: B, node2: B): Boolean

    /**
     * 尝试将node2插入node1的左节点或右节点，成功返回true失败返回false
     */
    fun tryInsertOnce(node1: B, node2: B): Boolean

    /**
     * 将node2插入node1左节点的位置
     * 如果node1的左节点不为null，
     * 则将node1的左节点插入node2的一个最近的空节点（insertToLastEmpty）
     */
    fun insertToLeft(node1: B, node2: B): Boolean

    /**
     * 将node2插入node1右节点的位置
     * 如果node1的右节点不为null，
     * 则将node1的右节点插入node2的一个最近的空节点（insertToLastEmpty）
     */

    fun insertToRight(node1: B, node2: B): Boolean
}

/**
 * 二叉树节点实现类
 */
class BinaryNodeTree<T>(node: T) : BinaryNodeInterface<T>, BasicIterator<T>(),
    TreeStruct<T, BinaryNodeTree<T>> {
    private var mNode = node
    var left: BinaryNodeTree<T>? = null
    var right: BinaryNodeTree<T>? = null
    override fun left(): BinaryNodeTree<T>? {
        return left;
    }

    override fun right(): BinaryNodeTree<T>? {
        return right;
    }

    override fun node(): T {
        return mNode
    }


    /**
     * 遍历方法
     */
    override fun iterator(node: BasicIterator<T>) {
        if (node is BinaryNodeTree) {
            super.iterator(node)
            node.left?.let {
                System.out.println("node"+it.node())
                iterator(it)
            }
            node.right?.let {
                System.out.println("node"+it.node())
                iterator(it)
            }
        }
    }

    override fun getNode(): T {
        return node()
    }

    override fun check(node: IteratorInterface<T,BasicIterator<T>>): Boolean {
        return node is BinaryNodeTree
    }

    override fun replaceLeft(node1: BinaryNodeTree<T>, node2: BinaryNodeTree<T>) {
        TODO("Not yet implemented")
    }

    override fun replaceRight(node1: BinaryNodeTree<T>, node2: BinaryNodeTree<T>) {
        TODO("Not yet implemented")
    }

    override fun insertToLeftLastEmpty(
        node1: BinaryNodeTree<T>,
        node2: BinaryNodeTree<T>
    ) {
    }

    override fun insertToRightLastEmpty(node1: BinaryNodeTree<T>, node2: BinaryNodeTree<T>) {
        TODO("Not yet implemented")
    }

    override fun insertToLastEmpty(node1: BinaryNodeTree<T>, node2: BinaryNodeTree<T>): Boolean {
        if (node1.left == null) {
            node1.left = node2
            return true
        } else if (node1.right == null) {
            node1.right = node2
            return true
        }
        var bool = insertToLastEmpty(node1.left!!, node2)
        if (bool) return true
        bool = insertToLastEmpty(node1.right!!, node2)
        if (bool) return true
        return false
    }


    override fun tryInsertOnce(node1: BinaryNodeTree<T>, node2: BinaryNodeTree<T>): Boolean {
        if (node1.left == null) {
            node1.left = node2
            return true
        } else if (node1.right == null) {
            node1.right = node2
            return true
        } else {
            return false
        }
    }

    override fun insertToLeft(node1: BinaryNodeTree<T>, node2: BinaryNodeTree<T>): Boolean {
        TODO("Not yet implemented")
    }

    override fun insertToRight(node1: BinaryNodeTree<T>, node2: BinaryNodeTree<T>): Boolean {
        TODO("Not yet implemented")
    }
}


/**
 * 树相关的错误信息
 */
class TreeException(code: Int) : Exception() {
    val mCode = code

    companion object {
        const val METHOD_INPUT_CLASS_CASE_EXECEPTION = 0
    }

    override val message: String?
        get() = mGetMessage()

    fun mGetMessage(): String? {
        var message: String? = null
        when (mCode) {
            METHOD_INPUT_CLASS_CASE_EXECEPTION -> {
                message = "方法的输入类型错误"
            }

            1 -> {

            }
        }
        return message
    }
}
