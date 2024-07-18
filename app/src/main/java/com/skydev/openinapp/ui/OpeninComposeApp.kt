package com.skydev.openinapp.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.skydev.openinapp.ui.common.NavBottomBar
import com.skydev.openinapp.ui.theme.OpeninAppTheme
import com.skydev.openinapp.ui.theme.greyMid

@Composable
fun OpeninComposeApp() {

    OpeninAppTheme {
        Scaffold(
            modifier = Modifier
                .fillMaxSize()
                .background(greyMid),
            bottomBar = {
                NavBottomBar(selectedIndex = 1)
            },
        ) { innerPadding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .background(greyMid)
            ) {
                Text("Opening App Test")
            }
        }
    }
}