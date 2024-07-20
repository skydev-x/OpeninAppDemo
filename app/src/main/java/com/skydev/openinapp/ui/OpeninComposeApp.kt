package com.skydev.openinapp.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavOptions
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.skydev.openinapp.ui.common.NavBottomBar
import com.skydev.openinapp.ui.nav.Campaigns
import com.skydev.openinapp.ui.nav.Courses
import com.skydev.openinapp.ui.nav.Home
import com.skydev.openinapp.ui.nav.NavGraph
import com.skydev.openinapp.ui.nav.Profile
import com.skydev.openinapp.ui.theme.OpeninAppTheme
import com.skydev.openinapp.ui.theme.greyMid

@Composable
fun OpeninComposeApp() {

    val navController = rememberNavController()
    val systemUiController: SystemUiController = rememberSystemUiController()
    LaunchedEffect(Unit) {
        systemUiController.isSystemBarsVisible = false
    }
    val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route
    var selectedIndex by remember {
        mutableIntStateOf(0)
    }

    LaunchedEffect(currentRoute) {
        selectedIndex = when (currentRoute) {
            Home.javaClass.name -> 0
            Courses.javaClass.name -> 1
            Campaigns.javaClass.name -> 2
            else -> 3
        }
    }
    OpeninAppTheme {
        Scaffold(
            modifier = Modifier
                .fillMaxSize()
                .background(greyMid),
            bottomBar = {
                NavBottomBar(selectedIndex = selectedIndex) {
                    selectedIndex = it
                    when (it) {
                        0 -> navController.navigate(
                            route = Home,
                            navOptions = NavOptions.Builder()
                                .setPopUpTo(Home, inclusive = true)
                                .setLaunchSingleTop(true)
                                .build()
                        )

                        1 -> navController.navigate(
                            route = Courses,
                            navOptions = NavOptions.Builder()
                                .setPopUpTo(Home, inclusive = true)
                                .build()
                        )

                        2 -> navController.navigate(
                            route = Campaigns,
                            navOptions = NavOptions.Builder().setLaunchSingleTop(true).build()
                        )

                        3 -> navController.navigate(
                            route = Profile,
                            navOptions = NavOptions.Builder().setLaunchSingleTop(true).build()
                        )

                    }
                }
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