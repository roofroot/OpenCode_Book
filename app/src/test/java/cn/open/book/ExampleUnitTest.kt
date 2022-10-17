package cn.open.book

import android.util.Log
import android.util.Log.i
import cn.open.book.base.national.datastruct.TwoWayNodeListStruct
import cn.open.book.base.national.datastruct.TwoWayNodeStruct
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun test_two_way_node_list_struct() {
        var nodeList = TwoWayNodeListStruct<String>()
        for (i in 1..100) {
            nodeList.addToLast(TwoWayNodeStruct("aaa" + i))
        }
        var temp = nodeList.first;
        System.out.println("test:" + nodeList.size)
        temp = nodeList.last
        for (i in 1..50) {
            System.out.println("test:" + temp.prev.node())
            temp = temp.prev
        }
        nodeList.insert(temp, TwoWayNodeStruct("fdsfdsf"));
        temp = nodeList.first
        while (temp.hasNext()) {
            System.out.println("test:" + temp.next.node())
            temp = temp.next
        }
    }
}