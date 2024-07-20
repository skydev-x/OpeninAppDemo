package com.skydev.openinapp.ui.nav

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.skydev.openinapp.ui.screen.campaigns.CampaignScreen
import com.skydev.openinapp.ui.screen.courses.CoursesScreen
import com.skydev.openinapp.ui.screen.home.HomeScreen
import com.skydev.openinapp.ui.screen.profile.ProfileScreen

@Composable
fun NavGraph(
    modifier: Modifier = Modifier,
    navHostController: NavHostController,
) {

    NavHost(modifier = modifier, navController = navHostController, startDestination = Home) {
        composable<Home> {
            HomeScreen()
        }
        composable<Courses> {
            CoursesScreen()
        }
        composable<Campaigns> {
            CampaignScreen()
        }
        composable<Profile> {
            ProfileScreen()
        }
    }

}