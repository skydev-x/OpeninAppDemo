package com.skydev.openinapp.ui.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.skydev.openinapp.R
import com.skydev.openinapp.ui.theme.greyMid
import org.koin.androidx.compose.koinViewModel

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = koinViewModel()
) {

    LaunchedEffect(Unit) {
        viewModel.initGreeting()
    }

    val greeting by viewModel.greeting.collectAsStateWithLifecycle()

    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(128.dp)
                .background(MaterialTheme.colorScheme.primary)
                .padding(horizontal = 16.dp, vertical = 40.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Dashboard",
                    style = MaterialTheme.typography.displayLarge.copy(Color.White)
                )
                IconButton(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color.White.copy(0.12f)),
                    onClick = {}
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_settings),
                        contentDescription = "settings button",
                        tint = Color.White
                    )
                }
            }
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.primary)
                .clip(RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp))
                .background(greyMid)
                .verticalScroll(rememberScrollState())
        ) {
            Text(text = greeting, style = MaterialTheme.typography.labelLarge)
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
            Text(text = "Context")
        }
    }
}