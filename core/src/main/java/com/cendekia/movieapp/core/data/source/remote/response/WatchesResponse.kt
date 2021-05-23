package com.cendekia.movieapp.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class WatchesResponse(
    @field:SerializedName("id")
    val id: String,

    @field:SerializedName("title")
    val title: String,
    @field:SerializedName("overview")
    val overview: String,
    @field:SerializedName("poster_path")
    val poster_path: String,
    @field:SerializedName("release_date")
    val release_date: String
)

