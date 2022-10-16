package cn.open.book.ui.compose.widget
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.PaintingStyle
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cn.open.book.ui.SCREEN_DENSITY
import cn.open.book.ui.SCREEN_W
import cn.open.book.ui.compose.theme.barColor
import cn.open.book.ui.compose.theme.titleOneColor
import cn.open.book.ui.compose.view.getGradientShader

/**
 * yuxiu
 * 2022/10/4
 * 测试用控件，暂时无用
 **/
@Composable
fun titleBar(
    listColor: List<Color> = listOf(Color(255, 255, 255, 255), barColor), listStop: List<Float>
    =listOf(0f, SCREEN_W.toFloat()),
    title: String, textColor: Color= titleOneColor, textSize: TextUnit=20.sp
) {
    Box(
        modifier = Modifier.height(40.dp)
    ) {
            Canvas(
                modifier = Modifier
                    .height(30.dp)
                    .fillMaxWidth()
                    .padding(top = 5.dp)
            ) {
                drawIntoCanvas { canvas ->
                    val paint = Paint()
                    paint.strokeWidth = 3f
                    paint.shader =
                        getGradientShader(listColor, listStop)
                    paint.style = PaintingStyle.Fill
                    var rect = Rect(
                        0f, 0f, SCREEN_W.toFloat(), 40 * SCREEN_DENSITY.toFloat()
                    )
//                    canvas.drawRect(rect, paint)
                    var path = Path();
                    path.moveTo(rect.left, rect.bottom)
                    path.quadraticBezierTo(
                        rect.left + 10 * SCREEN_DENSITY , rect.top,
                        rect.left + 50 * SCREEN_DENSITY, rect.top
                    )
                    path.lineTo(rect.right, rect.top)
                    path.quadraticBezierTo(
                        rect.right - 10 * SCREEN_DENSITY, rect.bottom,
                        rect.right - 50 * SCREEN_DENSITY, rect.bottom
                    )
                    path.lineTo(rect.left, rect.bottom)
                    canvas.drawPath(path, paint)

                }

            }
            Text(
                text = title,
                Modifier.padding(start=20.dp,top=10.dp),
                color = textColor,
                fontSize = textSize,
                fontStyle = FontStyle.Normal
            );

    }

}