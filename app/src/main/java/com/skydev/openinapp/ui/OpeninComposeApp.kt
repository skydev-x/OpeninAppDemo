package com.skydev.openinapp.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.skydev.openinapp.ui.common.NavBottomBar
import com.skydev.openinapp.ui.nav.NavGraph
import com.skydev.openinapp.ui.theme.OpeninAppTheme
import com.skydev.openinapp.ui.theme.greyMid

@Composable
fun OpeninComposeApp() {

    val navController = rememberNavController()
    val systemUiController: SystemUiController = rememberSystemUiController()
    LaunchedEffect(Unit) {
        systemUiController.isSystemBarsVisible = false
    }
    OpeninAppTheme {
        Scaffold(
            modifier = Modifier
                .fillMaxSize()
                .background(greyMid),
            bottomBar = {
                NavBottomBar(selectedIndex = 1)
            },
        ) { innerPadding ->
            NavGraph(
                modifier = Modifier
                    .padding(innerPadding)
                    .background(greyMid),
                navHostController = navController
            )

        }
    }
}