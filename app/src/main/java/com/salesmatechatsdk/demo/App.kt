package com.salesmatechatsdk.demo

import android.app.Application
import com.rapidops.salesmatechatsdk.core.SalesmateChatSDK
import com.rapidops.salesmatechatsdk.core.SalesmateChatSettings

class App : Application() {

    companion object {
        const val WORKSPACE_ID = ""
        const val APP_KEY = ""
        const val TENANT_ID = ""
    }

    override fun onCreate() {
        super.onCreate()

        val salesmateChatSettings =
            SalesmateChatSettings(WORKSPACE_ID, APP_KEY, TENANT_ID)

        SalesmateChatSDK.initialize(this, salesmateChatSettings)


    }
}