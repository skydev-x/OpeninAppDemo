package com.skydev.openinapp.ui.screen.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import com.skydev.openinapp.ui.common.LineChartComposable
import com.skydev.openinapp.ui.theme.greyDark

@Composable
fun OverviewGraph(modifier: Modifier = Modifier) {

    val data = listOf(
        Pair(0f, 50f),
        Pair(1f, 50f),
        Pair(2f, 25f),
        Pair(3f, 35f),
        Pair(4f, 60f),
        Pair(5f, 40f),
        Pair(6f, 70f),
        Pair(7f, 30f)
    )

    Column(
        modifier = modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(horizontal = 16.dp)
            .clip(MaterialTheme.shapes.small)
            .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp, end = 16.dp, bottom = 0.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Overview",
                style = MaterialTheme.typography.labelMedium.copy(color = greyDark)
            )
            Row(
                modifier = Modifier
                    .wrapContentSize()
                    .clip(MaterialTheme.shapes.small)
                    .border(width = 1.dp, color = greyDark, shape = MaterialTheme.shapes.small)
                    .padding(4.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "22 Aug - 23 Sept",
                    style = MaterialTheme.typography.labelMedium
                )
                Spacer(modifier = Modifier.padding(4.dp))
                Icon(
                    painter = painterResource(id = R.drawable.ic_clock),
                    contentDescription = "date range time",
                    tint = greyDark
                )
            }
        }
        LineChartComposable(
            data = data,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .padding(16.dp)
        )
    }
}