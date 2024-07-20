package com.skydev.openinapp.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Link(
    @SerialName("app") val app: String,
    @SerialName("created_at") val createdAt: String,
    @SerialName("domain_id") val domainId: String,
    @SerialName("is_favourite") val isFavourite: Boolean,
    @SerialName("original_image") val originalImage: String,
    @SerialName("smart_link") val smartLink: String,
    @SerialName("thumbnail") val thumbnail: String? = null,
    @SerialName("times_ago") val timesAgo: String,
    @SerialName("title") val title: String,
    @SerialName("total_clicks") val totalClicks: Int,
    @SerialName("url_id") val urlId: Int,
    @SerialName("url_prefix") val urlPrefix: String? = null,
    @SerialName("url_suffix") val urlSuffix: String? = null,
    @SerialName("web_link") val webLink: String
)



