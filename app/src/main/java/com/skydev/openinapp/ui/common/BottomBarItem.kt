package com.skydev.openinapp.ui.common

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun BottomBarItem(
    modifier: Modifier = Modifier,
    text: String, icon: Int,
    selectedId: Int,
    index: Int,
    onClick: (Int) -> Unit = {}
) {

    val isSelected by remember(selectedId) {
        derivedStateOf {
            selectedId == index
        }
    }

    val selectedGrad =
        Brush.linearGradient(
            listOf(
                MaterialTheme.colorScheme.primary,
                MaterialTheme.colorScheme.secondary
            )
        )

    val unSelectedGrad = Brush.linearGradient(
        listOf(
            MaterialTheme.colorScheme.secondaryContainer,
            MaterialTheme.colorScheme.secondaryContainer
        )
    )


    val backgroundColor = remember(isSelected) {
        derivedStateOf {
            if (isSelected) {
                selectedGrad
            } else {
                unSelectedGrad
            }
        }
    }



    Column(
        modifier = modifier
            .size(60.dp)
            .border(
                width = 1.dp,
                brush = backgroundColor.value,
                shape = MaterialTheme.shapes.small
            )
            .clip(MaterialTheme.shapes.small)
            .clickable { onClick(index) },
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = null,
            tint = if (isSelected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSecondary,
            modifier = Modifier.size(20.dp)
        )
        Spacer(modifier = Modifier.padding(4.dp))
        Text(
            text = text,
            style = MaterialTheme.typography.labelSmall.copy(color = if (isSelected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSecondary)
        )
    }

}
