package cn.open.book.ui.compose.widget

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import cn.open.book.ui.SCREEN_DENSITY
import cn.open.book.ui.SCREEN_W
import cn.open.book.ui.compose.data.HighLightWord

val isShowInterpretationView: MutableState<Boolean> = mutableStateOf(false)
val wordChange: MutableState<Boolean> = mutableStateOf(false)
var interpretationWordEntity: HighLightWord? = null;
var scrollOffset: MutableState<Int> = mutableStateOf(0)

/**
 * 预览界面
 */
@Composable
fun InterpretationView() {
    if (isShowInterpretationView.value) {
        if (wordChange.value || !wordChange.value) {
            interpretationWordEntity?.points?.let { points ->
                if (interpretationWordEntity!!.haveTranslate) {
                    Box(
                        Modifier.offset(
                            if ((points.x / SCREEN_DENSITY).dp < (SCREEN_W / SCREEN_DENSITY - 100).dp) (points.x / SCREEN_DENSITY).dp
                            else (SCREEN_W / SCREEN_DENSITY - 100).dp,
                            ((points.y) / SCREEN_DENSITY).dp
                        )
                    ) {
                        Text(
                            text = interpretationWordEntity!!.translate, modifier = Modifier
                                .wrapContentWidth()
                                .widthIn(
                                    min = 100.dp,
                                    max = if ((points.x / SCREEN_DENSITY).dp < (SCREEN_W / SCREEN_DENSITY - 100).dp) ((SCREEN_W - points.x) / SCREEN_DENSITY).dp
                                    else 100.dp
                                )
                                .wrapContentHeight()
                                .background(Color.Black)
                                .clickable {
                                    isShowInterpretationView.value = false
                                    interpretationWordEntity?.let {
                                        it.isHighLight.value = false
                                    }
                                }, color = Color.White
                        )
                    }

                } else {
                    InputView()
                }
            }
        }
    }
}