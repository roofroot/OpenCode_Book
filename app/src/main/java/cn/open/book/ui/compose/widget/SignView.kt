package cn.open.book.ui.compose.widget

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * 标记view，待完善 （标签部分后续优化方案 ，
 * 增加多个汉字标记为一个标签的功能。）
 */
@Composable
fun LineView() {
    Text(
        text = "", modifier = Modifier
            .fillMaxWidth()
            .height(20.dp), color = Color.Black
    )
}