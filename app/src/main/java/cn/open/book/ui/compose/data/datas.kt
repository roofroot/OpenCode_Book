package cn.open.book.ui.compose.data

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

open class WordEntity(
    var word: String,
    var translate: String,
    var type: Int = 0,
    var points: Points = Points(0f, 0f),
)//0普通，1换行符号

data class HighLightWord(
    var word: String,
    var translate: String,
    var haveTranslate: Boolean = false,
    var type: Int = 0,
    var isHighLight: MutableState<Boolean> = mutableStateOf(false),
    var points: Points = Points(0f, 0f),
)

data class Points(var x: Float, var y: Float)

val chapter1 =
    "In this chapter, we discuss the aims and goals of this text and briefly review programming  concepts and discrete mathematics. We will\n" +
            "\n" +
            "See that how program performs for reasonably large input is just as important as its  performance on moderate amounts of input.\n" +
            "\n" +
            " Summarize the basic mathematical background needed for the rest of the book.\n" +
            "\n" +
            " Briefly review recursion\n" +
            "\n" +
            " Summarize some important features of Java that are used throughout the text.\n" +
            "\n" +
            " 1. What's the Book About?\n" +
            "\n" +
            " Suppose you have a group of N numbers and would like to determine the kth largest. This  is known as the selection problem. Most students who have had a programming course  or two would have no difhculty writing a program to solve this problem. There are quite a few \"obvious\"solutions.\n" +
            "\n" +
            "   One way to solve this problem would be to read the N numbers into an arra sort the  array in decreasing order by some simple algorithm such as bubblesort, and then return  the element in position \uD835\uDCF4\n" +
            "\n" +
            "   A somewhat better algorithm might be to read the first \uD835\uDCF4 elements into an array and  sort them (in decreasing order) . Next, each remaining element is read one by one. As a new  element arrives, it is ignored if it is smaller than the kth element in the array Otherwise, it  is placed in its correct spot in the array, bumping one element out of the array When the  algorithm ends, the element in the kth position returned as the answer.\n" +
            "\n" +
            "   Both algorithms are simple to code, and you are encouraged to do so. The natural questions, then, are which algorithm is better and, more important, is either algorithm good  enough? A simulation using a random hle of 30 million elements and k = 15,000,000. will show that neither algorithm hnishes in a reasonable amount of time, each requires  several days of computer processing to terminate (albeit eventually with a correct answer). An alternative method, discussed in Chapter 7, gives a solution in about a second. Thus  although our proposed algorithms work, they cannot be considered good algorithms  because they are entirely impractical for input sizes that a third algorithm can handle in a  reasonable amount of time"