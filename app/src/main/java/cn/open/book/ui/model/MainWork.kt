package cn.open.book.ui.model
import android.app.Activity
import android.view.View
import cn.open.book.databinding.ActivityMainBinding
import cn.open.book.ui.base.MyBaseWork
import cn.open.book.ui.compose.widget.ChapterRootView

/**
 * yuxiu
 * 2022/10/4
 **/
class MainWork(binding: ActivityMainBinding, context: Activity) :
    MyBaseWork<ActivityMainBinding>(binding, context) {
    init {
        binding.composeView.setContent {
            ChapterRootView()
        }
    }

    override fun onClick(view: View?) {

    }
}