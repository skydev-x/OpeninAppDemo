package com.skydev.openinapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.skydev.openinapp.data.local.SharedPreferencesManager
import com.skydev.openinapp.ui.OpeninComposeApp
import org.koin.android.ext.android.inject

class MainActivity : ComponentActivity() {

    private val sharedPreferencesManager by inject<SharedPreferencesManager>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        saveToken()
        setContent {
            OpeninComposeApp()
        }
    }

    private fun saveToken() {
        sharedPreferencesManager.saveToken(BuildConfig.AUTH_TOKEN)
    }
}

