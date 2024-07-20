package com.skydev.openinapp.utils

import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

object AppUtils {
    fun String.toDisplayDate(): String {
        val inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.ENGLISH)
        val dateTime = ZonedDateTime.parse(this, inputFormatter)
        val outputFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.ENGLISH)
        return dateTime.format(outputFormatter)
    }
}