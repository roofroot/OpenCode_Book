package cn.open.book

import cn.open.book.base.national.datastruct.nodelist.TwoWayNodeListStruct
import cn.open.book.base.national.datastruct.nodelist.TwoWayNodeStruct
import cn.open.book.base.national.datastruct.tree.BinaryNodeTree
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun test_two_way_node_list_struct() {
        var nodeList =
            TwoWayNodeListStruct<String>()
        for (i in 1..100) {
            nodeList.addToLast(
                TwoWayNodeStruct(
                    "aaa" + i
                )
            )
        }
        var temp = nodeList.first;
        System.out.println("test:" + nodeList.size)
        temp = nodeList.last
        for (i in 1..50) {
            System.out.println("test:" + temp.prev.node())
            temp = temp.prev
        }
        nodeList.insert(
            temp,
            TwoWayNodeStruct("fdsfdsf")
        );
        temp = nodeList.first
        while (temp.hasNext()) {
            System.out.println("test:" + temp.next.node())
            temp = temp.next
        }
    }
    @Test
    fun test_binary_tree() {
        val tree= BinaryNodeTree<String>("root")
        for(i in 1..100){
            tree.insertToLastEmpty(tree, BinaryNodeTree("aaa" + i))
        }
//        tree.left = BinaryNodeTree("a")
//        tree.right = BinaryNodeTree("b")
//        tree.left!!.left=BinaryNodeTree("c")
//        tree.left!!.right=BinaryNodeTree("d")
//        tree.right!!.left=BinaryNodeTree("e")
//        tree.right!!.right=BinaryNodeTree("f")

        val nodeList=tree.toList()
        var temp = nodeList.first
        var i=0
        while (temp!=null&&temp.hasNext()) {
            System.out.println("view the list:" + temp.next.node());
            i++
            temp = temp.next
        }
        System.out.println("size:"+i)
    }
}