package com.skydev.openinapp.ui.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.skydev.openinapp.R
import com.skydev.openinapp.ui.theme.greyMid

@Composable
fun NavBottomBar(
    modifier: Modifier = Modifier,
    navHeight: Dp = 80.dp,
    fabSize: Dp = 64.dp,
    selectedIndex: Int,
    onNavigate: (Int) -> Unit = {}
) {
    val width = LocalConfiguration.current.screenWidthDp
    val height = remember {
        (navHeight + fabSize / 2)
    }

    Box(
        modifier = modifier
            .background(greyMid)
            .fillMaxWidth()
            .height(height)
            .clip(
                shape = BottomBarShape(width.dp.value, height.value)
            )
            .shadow(
                elevation = 50.dp,
                shape = BottomBarShape(width.dp.value, height.value),
            )
            .background(Color.White),
        contentAlignment = Alignment.BottomCenter
    ) {

        Row(
            modifier = modifier
                .fillMaxWidth()
                .background(Color.Transparent)
                .padding(2.dp)
                .align(Alignment.BottomCenter),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            BottomBarItem(
                text = "Streaks",
                icon = R.drawable.ic_launcher_foreground,
                selectedId = selectedIndex,
                index = 0
            ) {
                onNavigate(it)
            }
            BottomBarItem(
                text = "Flashes",
                icon = R.drawable.ic_launcher_foreground,
                selectedId = selectedIndex,
                index = 1
            ) {
                onNavigate(it)
            }
            Spacer(modifier = Modifier.width(64.dp))
            BottomBarItem(
                text = "Profile",
                icon = R.drawable.ic_launcher_foreground,
                selectedId = selectedIndex,
                index = 2
            ) {
                onNavigate(it)
            }
            BottomBarItem(
                text = "Profile",
                icon = R.drawable.ic_launcher_foreground,
                selectedId = selectedIndex,
                index = 3
            ) {
                onNavigate(it)
            }
        }

        LargeFloatingActionButton(
            modifier = Modifier
                .size(60.dp)
                .align(Alignment.Center)
                .shadow(
                    elevation = 2.dp,
                    shape = CircleShape,
                    ambientColor = MaterialTheme.colorScheme.primary,
                    spotColor = MaterialTheme.colorScheme.primary
                ),
            onClick = { },
            shape = CircleShape,
            containerColor = MaterialTheme.colorScheme.primary,
            elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation(defaultElevation = 0.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_add),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(16.dp)
            )
        }
    }
}