package com.skydev.openinapp.ui.screen.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.skydev.openinapp.R
import com.skydev.openinapp.data.model.Link
import com.skydev.openinapp.ui.theme.blue
import com.skydev.openinapp.ui.theme.greyMid
import com.skydev.openinapp.utils.AppUtils.toDisplayDate

@Composable
fun LinkItem(
    link: Link
) {
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 16.dp)
    ) {
        Column(
            modifier = Modifier
                .background(Color.White)
        ) {
            Row(
                modifier = Modifier.padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                AsyncImage(
                    model = link.originalImage,
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                        .background(Color.White)
                        .clip(MaterialTheme.shapes.small)
                        .border(1.dp, greyMid, MaterialTheme.shapes.small),
                    contentScale = ContentScale.Crop,

                    )
                Spacer(modifier = Modifier.width(8.dp))
                Column(
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = link.title,
                        style = MaterialTheme.typography.bodyLarge,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.width(200.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = link.createdAt.toDisplayDate(),
                        style = MaterialTheme.typography.titleSmall
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Column(
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = link.totalClicks.toString(),
                        style = MaterialTheme.typography.titleMedium
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Clicks",
                        style = MaterialTheme.typography.titleSmall
                    )
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .background(
                        blue.copy(0.12f),
                        RoundedCornerShape(bottomStart = 8.dp, bottomEnd = 8.dp)
                    )
                    .fillMaxWidth()
                    .drawBehind {
                        val stroke = Stroke(
                            width = 4f,
                            pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 10f), 0f)
                        )

                        drawRoundRect(
                            color = blue,
                            style = stroke,
                            cornerRadius = CornerRadius(24f)
                        )
                    }
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Text(
                    text = link.smartLink,
                    style = MaterialTheme.typography.bodyLarge.copy(blue),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.weight(1f)
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_copy),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp)
                        .clickable {

                        },
                    tint = blue
                )
            }
        }
    }
}