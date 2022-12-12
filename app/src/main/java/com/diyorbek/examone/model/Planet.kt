package com.diyorbek.examone.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Planet(
    val img: Int,
    val name: String
) : Parcelable
