package com.skydev.openinapp.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Data(
    @SerialName("favourite_links") val favouriteLinks: List<Link>,
    @SerialName("overall_url_chart") val overallUrlChart: Map<String, Int>,
    @SerialName("recent_links") val recentLinks: List<Link>,
    @SerialName("top_links") val topLinks: List<Link>
)