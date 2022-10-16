package cn.open.book.ui.activity
import cn.open.book.databinding.ActivityMainBinding
import cn.open.book.ui.base.MyBaseActivity
import cn.open.book.ui.model.MainWork

/**
 * yuxiu
 * 2022/10/4
 **/
class MainActivity : MyBaseActivity<ActivityMainBinding, MainWork>() {
    override fun onPrepare() {

    }

    override fun getBindingInstance(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun getModelInstance(): MainWork {
        return MainWork(binding,this)
    }

}