package cn.open.book.ui.compose.theme
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

//private val DarkColorPalette = darkColorScheme(
//    primary = primaryColor,
//    secondary = secondaryColor
//)
//
//private val LightColorPalette = lightColorScheme(
//    primary = primaryColor,
//    secondary = secondaryColor
//
//    /* Other default colors to override
//    background = Color.White,
//    surface = Color.White,
//    onPrimary = Color.White,
//    onSecondary = Color.Black,
//    onBackground = Color.Black,
//    onSurface = Color.Black,
//    */
//)

@Composable
fun BaseTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
//    val colors = if (darkTheme) {
//        DarkColorPalette
//    } else {
//        LightColorPalette
//    }

    MaterialTheme(
        typography = Typography,
        content = content
    )
}

