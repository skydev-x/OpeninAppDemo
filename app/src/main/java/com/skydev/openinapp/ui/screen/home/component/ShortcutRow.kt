package com.skydev.openinapp.ui.screen.home.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.skydev.openinapp.domain.model.ShortcutData

@Composable
fun ShortcutRow(
    modifier: Modifier = Modifier,
    shortcuts: List<ShortcutData>
) {
    LazyRow(
        modifier = modifier.padding(start = 16.dp, top = 16.dp, bottom = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        items(shortcuts) {
            DashboardShortcut(data = it)
        }
    }
}