package cn.open.book.ui.compose.widget

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.onPlaced
import androidx.compose.ui.layout.positionInWindow
import cn.open.book.ui.compose.TestData.chapter1
import cn.open.book.ui.compose.theme.BaseTheme
import cn.open.book.ui.compose.util.DataUtils

/**
 * 章节顶级目录。
 */
@Composable
fun ChapterRootView() {

    Surface {
        var offsetx = remember {
            mutableStateOf(0)
        }
        BaseTheme {
            Column(modifier = Modifier
                .verticalScroll(rememberScrollState(0))
                .onPlaced { it ->
                    scrollOffset.value = it.positionInWindow().y.toInt()
                }
                .onGloballyPositioned {
                    scrollOffset.value = it.positionInWindow().y.toInt()
                }
            ) {
                titleBar(title = "test")
                var list = DataUtils.getWordList(chapter1)
                WordLine(list = list)
            }
        }
        InterpretationView()
    }

}
