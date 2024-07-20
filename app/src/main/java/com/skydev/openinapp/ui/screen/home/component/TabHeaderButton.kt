package com.skydev.openinapp.ui.screen.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
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
import com.skydev.openinapp.R
import com.skydev.openinapp.ui.theme.blue
import com.skydev.openinapp.ui.theme.greyDark

@Composable
fun TabHeaderButton(
    modifier: Modifier = Modifier,
    selectedId: Int = 0,
    onSelected: (Int) -> Unit
) {

    Row(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(16.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Top Links",
            style = MaterialTheme.typography.displayMedium.copy(
                color = if (selectedId == 0) Color.White else greyDark
            ),
            modifier = Modifier
                .wrapContentSize()
                .clip(MaterialTheme.shapes.large)
                .background(if (selectedId == 0) blue else Color.Transparent)
                .clickable { onSelected(0) }
                .padding(8.dp)
        )
        Spacer(modifier = Modifier.padding(8.dp))
        Text(
            text = "Recent Links",
            style = MaterialTheme.typography.displayMedium.copy(
                color = if (selectedId == 1) Color.White else greyDark
            ),
            modifier = Modifier
                .wrapContentSize()
                .clip(MaterialTheme.shapes.large)
                .background(if (selectedId == 1) blue else Color.Transparent)
                .clickable { onSelected(1) }
                .padding(8.dp)
        )
        Spacer(modifier = Modifier.weight(1f))
        Icon(
            painter = painterResource(id = R.drawable.ic_search),
            contentDescription = null,
            tint = greyDark,
            modifier = Modifier
                .wrapContentSize()
                .clip(MaterialTheme.shapes.small)
                .border(
                    1.dp,
                    greyDark.copy(0.5f), MaterialTheme.shapes.small
                )
                .padding(8.dp)
        )
    }

}