package com.example.bestanime.data

import com.example.bestanime.R
import com.example.bestanime.model.Anime

class Datasource {
    fun loadAnimes(): List<Anime> {
        return listOf(
            Anime(R.string.anime1, R.drawable.image1),
            Anime(R.string.anime2, R.drawable.image2),
            Anime(R.string.anime3, R.drawable.image3),
            Anime(R.string.anime4, R.drawable.image4),
            Anime(R.string.anime5, R.drawable.image5),
            Anime(R.string.anime6, R.drawable.image6),
            Anime(R.string.anime7, R.drawable.image7),
            Anime(R.string.anime8, R.drawable.image8),
            Anime(R.string.anime9, R.drawable.image9),
            Anime(R.string.anime10, R.drawable.image10)
        )
    }
}