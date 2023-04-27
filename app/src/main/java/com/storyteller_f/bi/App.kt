package com.storyteller_f.bi

import android.app.Application
import com.a10miaomiao.bilimiao.comm.BilimiaoCommApp
import com.storyteller_f.bi.unstable.readUserInfo

class App: Application() {

    companion object {
        lateinit var commApp: BilimiaoCommApp
    }

    init {
        commApp = BilimiaoCommApp(this)
    }

    override fun onCreate() {
        super.onCreate()
        commApp.onCreate()
        readUserInfo()
    }
}
