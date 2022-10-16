package cn.open.book.ui.compose.view

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.LinearGradientShader
import androidx.compose.ui.graphics.Shader
import androidx.compose.ui.graphics.TileMode
import cn.open.book.ui.SCREEN_W
import cn.open.book.ui.activity.MainActivity

/**
 * yuxiu
 * 2022/10/4
 **/
fun getGradientShader(listColor: List<Color>, listStop: List<Float>): Shader {
    return LinearGradientShader(
        Offset.Zero,
        Offset(SCREEN_W.toFloat(), 0f),
        listColor, listStop, TileMode.Clamp
    )
}