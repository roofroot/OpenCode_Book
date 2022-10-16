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
