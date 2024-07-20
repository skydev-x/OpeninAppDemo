package com.skydev.openinapp.ui.common

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
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

@Composable
fun IconColoredButton(
    modifier: Modifier = Modifier,
    iconId: Int,
    iconColor: Color,
    label: String
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(horizontal = 16.dp)
            .clip(MaterialTheme.shapes.small)
            .border(
                1.dp, iconColor, MaterialTheme.shapes.small
            )
            .background(iconColor.copy(0.12f)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        Spacer(modifier = Modifier.padding(8.dp))
        Icon(
            painter = painterResource(id = iconId),
            contentDescription = null,
            tint = iconColor
        )
        Spacer(modifier = Modifier.padding(4.dp))
        Text(
            text = label,
            style = MaterialTheme.typography.displayMedium,
            modifier = Modifier.padding(16.dp)
        )
    }
}