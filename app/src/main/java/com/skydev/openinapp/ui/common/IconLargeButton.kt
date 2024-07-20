package com.skydev.openinapp.ui.common

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.skydev.openinapp.ui.theme.greyDark

@Composable
fun IconLargeButton(
    modifier: Modifier = Modifier,
    iconId: Int,
    label: String
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(16.dp)
            .clip(MaterialTheme.shapes.small)
            .border(
                1.dp, greyDark, MaterialTheme.shapes.small
            ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Icon(painter = painterResource(id = iconId), contentDescription = null)
        Spacer(modifier = Modifier.padding(8.dp))
        Text(text = label, style = MaterialTheme.typography.displayMedium, modifier = Modifier.padding(16.dp))
    }
}