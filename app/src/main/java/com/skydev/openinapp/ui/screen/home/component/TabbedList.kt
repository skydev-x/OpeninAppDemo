package com.skydev.openinapp.ui.screen.home.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.skydev.openinapp.data.model.Link

@Composable
fun TabbedList(
    modifier: Modifier = Modifier,
    topLinks: List<Link>,
    recentLinks: List<Link>,
) {
    var selectedIndex by remember {
        mutableIntStateOf(0)
    }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        TabHeaderButton(
            selectedId = selectedIndex
        ) {
            selectedIndex = it
        }
        AnimatedVisibility(visible = selectedIndex == 0) {
            Column {
                repeat(topLinks.size) {
                    LinkItem(link = topLinks[it])
                }
            }
        }
        AnimatedVisibility(visible = selectedIndex == 1) {
            Column {
                repeat(recentLinks.size) {
                    LinkItem(link = recentLinks[it])
                }
            }
        }
    }


}