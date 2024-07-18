package com.skydev.openinapp.ui.common

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp

class BottomBarShape(private val width: Float, private val height: Float) :
    Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        return Outline.Generic(
            path = bottomBarPath(width * density.density, height * density.density, density)
        )
    }

}

fun bottomBarPath(width: Float, height: Float, density: Density): Path {
    val baselineY = height - (80.dp.value * density.density)
    val waveWidth = width * 0.15f
    val waveHeight = 20.dp.value * density.density
    val waveStart = (width - waveWidth) / 2

    return Path().apply {
        moveTo(0f, baselineY)
        lineTo(waveStart, baselineY)
        cubicTo(
            x1 = waveStart + waveWidth * 0.33f,
            y1 = baselineY - waveHeight,
            x2 = waveStart + waveWidth * 0.66f,
            y2 = baselineY - waveHeight,
            x3 = waveStart + waveWidth,
            y3 = baselineY
        )
        lineTo(width, baselineY)
        lineTo(width, height)
        lineTo(0f, height)
        close()
    }

}