package com.skydev.openinapp.domain.model

import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color

@Stable
data class ShortcutData(
    val label : String,
    val value : String,
    val iconId : Int,
    val iconColor : Color
)