package cn.open.book.application

import android.app.Application
import android.content.res.Resources
import cn.open.book.ui.SCREEN_DENSITY
import cn.open.book.ui.SCREEN_H
import cn.open.book.ui.SCREEN_W

/**
 * yuxiu
 * 2022/10/4
 **/
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        SCREEN_W = Resources.getSystem().getDisplayMetrics().widthPixels;
        SCREEN_H = Resources.getSystem().getDisplayMetrics().heightPixels;
        SCREEN_DENSITY = Resources.getSystem().displayMetrics.density
    }
}