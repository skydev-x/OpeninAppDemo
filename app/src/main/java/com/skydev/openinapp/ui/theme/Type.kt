package com.skydev.openinapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.skydev.openinapp.R

// Set of Material typography styles to start with
val figtreeFamily = FontFamily(
    Font(R.font.figtree_italic, FontWeight.Normal),
    Font(R.font.figtree_light, FontWeight.Light),
    Font(R.font.figtree_light_italic, FontWeight.Light),
    Font(R.font.figtree_medium, FontWeight.Medium),
    Font(R.font.figtree_medium_italic, FontWeight.Medium),
    Font(R.font.figtree_regular, FontWeight.Normal),
    Font(R.font.figtree_semi_bold, FontWeight.SemiBold),
    Font(R.font.figtree_semi_bold_italic, FontWeight.SemiBold),
    Font(R.font.figtree_extra_bold, FontWeight.ExtraBold),
    Font(R.font.figtree_extra_bold_italic, FontWeight.ExtraBold),
    Font(R.font.figtree_bold, FontWeight.Bold),
    Font(R.font.figtree_bold_italic, FontWeight.Bold),
    Font(R.font.figtree_black, FontWeight.Bold),
    Font(R.font.figtree_black_italic, FontWeight.Bold),

    )

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = figtreeFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = figtreeFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 12.sp,
        letterSpacing = 0.sp
    ),
    displayLarge = TextStyle(
        fontFamily = figtreeFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    ),
    displayMedium = TextStyle(
        fontFamily = figtreeFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.sp
    ),
    displaySmall = TextStyle(
        fontFamily = figtreeFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 11.sp,
        lineHeight = 12.sp,
        letterSpacing = 0.sp
    ),
    titleLarge = TextStyle(
        fontFamily = figtreeFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.sp
    ),
    titleMedium = TextStyle(
        fontFamily = figtreeFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.sp
    ),
    titleSmall = TextStyle(
        fontFamily = figtreeFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.sp
    ),
    labelLarge = TextStyle(
        fontFamily = figtreeFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.sp
    ),
    labelMedium = TextStyle(
        fontFamily = figtreeFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = figtreeFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 9.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.sp
    ),


    )