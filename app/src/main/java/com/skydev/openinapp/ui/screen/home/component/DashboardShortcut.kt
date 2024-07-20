package com.skydev.openinapp.ui.screen.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.skydev.openinapp.domain.model.ShortcutData
import com.skydev.openinapp.ui.theme.greyDark


@Composable
fun DashboardShortcut(
    modifier: Modifier = Modifier,
    data: ShortcutData
) {
    Column(
        modifier = modifier
            .size(120.dp)
            .clip(MaterialTheme.shapes.small)
            .background(Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {
        Icon(
            painter = painterResource(id = data.iconId),
            contentDescription = null,
            tint = data.iconColor,
            modifier = Modifier
                .size(32.dp)
                .clip(CircleShape)
                .background(data.iconColor.copy(alpha = 0.12f))
                .padding(4.dp)
        )
        Spacer(modifier = Modifier.padding(8.dp))
        Text(text = data.value, style = MaterialTheme.typography.displayMedium)
        Spacer(modifier = Modifier.padding(2.dp))
        Text(text = data.label, style = MaterialTheme.typography.labelMedium.copy(color = greyDark))
    }
}