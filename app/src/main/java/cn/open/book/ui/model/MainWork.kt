package cn.open.book.ui.model

import android.app.Activity
import android.view.View
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import cn.open.book.databinding.ActivityMainBinding
import cn.open.book.ui.SCREEN_DENSITY
import cn.open.book.ui.SCREEN_W
import cn.open.book.ui.base.MyBaseWork
import cn.open.book.ui.compose.widget.ChapterRootView
import cn.open.widget_lib.ColorPalette


/**
 * yuxiu
 * 2022/10/4
 **/
class MainWork(binding: ActivityMainBinding, context: Activity) :
  MyBaseWork<ActivityMainBinding>(binding, context) {
  var palette = ColorPalette(Color.Blue, Color.Yellow, SCREEN_W, SCREEN_DENSITY)
  init {
    binding.composeView.setContent {
      var fgColor: MutableState<Color> = remember {
        mutableStateOf(palette.fgColor)
      }
      var bgColor: MutableState<Color> = remember {
        mutableStateOf(palette.fgColor)
      }
      palette.PaletteWidget(fgColor = fgColor, bgColor = bgColor)
//            ChapterRootView(palette)
    }
  }

  override fun onClick(view: View?) {

  }
}
