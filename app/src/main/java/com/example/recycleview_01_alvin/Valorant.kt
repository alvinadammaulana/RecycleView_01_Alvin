package com.example.recycleview_01_alvin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Valorant(
    val imgValorant: Int,
    val nameValorant: String,
    val descValorant: String,
) : Parcelable
