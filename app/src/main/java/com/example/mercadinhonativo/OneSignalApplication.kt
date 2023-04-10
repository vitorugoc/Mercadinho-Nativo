package com.example.mercadinhonativo

import android.app.Application;
import com.onesignal.OneSignal


class OneSignalApplication: Application() {

    private val ONESIGNAL_APP_ID = "9336d0fa-ffab-48b5-8f5f-b13e0ce957aa"

    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }
}