package cn.open.book.ui.compose.widget

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import cn.open.book.ui.compose.theme.bgColor

/**
 * 输入框，页面待完善
 */
@Composable
fun InputView() {
    var content: MutableState<String> = remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth().background(Color.White)
    ) {
//            Image(
//                contentDescription = "",
//                painter = painterResource(id = R.mipmap.transbg),
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .fillMaxHeight()
//
//            )
        TextField(
            value = content.value,
            textStyle = TextStyle(color = Color.Black),
            onValueChange = { it ->
                content.value = it
            },
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        )
        Row(
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            Text(text = "确定",
                Modifier
                    .width(50.dp)
                    .height(20.dp)
                    .clickable {
                        interpretationWordEntity?.translate = content.value
                        interpretationWordEntity?.haveTranslate = true
                        wordChange.value=!wordChange.value
                    })
            Text(
                text = "取消",
                Modifier
                    .width(50.dp)
                    .height(20.dp)
                    .clickable {
                        isShowInterpretationView.value = false
                    }

            )
        }
    }
}