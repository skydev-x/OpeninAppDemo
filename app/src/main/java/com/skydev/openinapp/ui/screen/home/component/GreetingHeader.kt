package com.skydev.openinapp.ui.screen.home.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.skydev.openinapp.ui.theme.greyDark

@Composable
fun GreetingHeader(
    modifier: Modifier = Modifier,
    greeting: String,
    name: String = "Sanjeet Yadav"
) {
    Column(
        modifier = modifier.padding(
            horizontal = 16.dp,
            vertical = 40.dp
        )
    ) {
        Text(text = greeting, style = MaterialTheme.typography.labelLarge.copy(color = greyDark))
        Text(text = name, style = MaterialTheme.typography.displayLarge)
    }
}