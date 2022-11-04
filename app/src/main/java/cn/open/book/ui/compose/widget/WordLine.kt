package cn.open.book.ui.compose.widget

import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cn.open.book.ui.SCREEN_W
import cn.open.book.ui.compose.data.HighLightWord
import cn.open.widget_lib.StaggeredGrid

/**
 * 段落，由word控件组成
 */
@Composable
fun WordLine(list: ArrayList<HighLightWord>) {
    StaggeredGrid(
        Modifier
            .wrapContentWidth()
            .wrapContentHeight(), list.size, SCREEN_W
    ) {
        for (entity in list) {
            if (entity.type == 0) {
                WordView(text = entity)
            } else if (entity.type == 1) {
                LineView()
            }
        }
    }
}
