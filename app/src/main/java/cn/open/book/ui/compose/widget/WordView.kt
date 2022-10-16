package cn.open.book.ui.compose.widget

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInWindow
import androidx.compose.ui.unit.dp
import cn.open.book.ui.compose.data.HighLightWord
import cn.open.book.ui.compose.data.Points

/**
 * 词汇控件，用于保存最小单元，一个单词，或一个汉字
 */
@Composable
fun WordView(text: HighLightWord) {
    var isHigh = remember {
        text.isHighLight
    }
    Text(text = text.word,
        modifier = Modifier
            .background(if (isHigh!!.value) Color.Cyan else Color.Transparent)
            .wrapContentWidth()
            .height(20.dp)
            .padding(start = 10.dp)
            .onGloballyPositioned {
                text.points = Points(it.positionInWindow().x, it.positionInWindow().y)
                wordChange.value = !wordChange.value
            }
            .clickable {
                interpretationWordEntity?.let {
                    it.isHighLight.value = false
                }
                text.isHighLight.value = true
                interpretationWordEntity = text
                isShowInterpretationView.value = true
                wordChange.value = !wordChange.value
            },
        color = Color.Black
    )
}