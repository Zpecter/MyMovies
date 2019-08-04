package com.jfma75.mymovies.server

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.TypeParceler

@Parcelize
@TypeParceler<Rating, RatingParceler>
data class Rating(
    @SerializedName("Value")
    val value: String,
    @SerializedName("Source")
    val source: String
) : Parcelable