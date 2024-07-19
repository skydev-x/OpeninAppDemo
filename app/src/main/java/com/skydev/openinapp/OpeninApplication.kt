package com.skydev.openinapp

import android.app.Application
import com.skydev.openinapp.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class OpeninApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@OpeninApplication)
            modules(appModule)
        }
    }

}