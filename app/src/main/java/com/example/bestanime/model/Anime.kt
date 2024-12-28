package com.example.bestanime.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Anime(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    val description: String // Tambahkan deskripsi
)