package com.example.bestanime

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.unit.dp
import com.example.bestanime.model.Anime
import com.example.bestanime.ui.theme.AnimeDetailScreen
import com.example.bestanime.ui.theme.BestAnimeTheme
import com.example.bestanime.data.DataSource
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BestAnimeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController, startDestination = "anime_list") {
                        composable("anime_list") {
                            BestAnimeApp(navController)
                        }
                        composable("anime_detail/{animeId}") { backStackEntry ->
                            val animeId = backStackEntry.arguments?.getString("animeId")?.toInt() ?: 0
                            val anime = DataSource().loadAnimes()[animeId]
                            AnimeDetailScreen(anime) {
                                navController.navigateUp() // Kembali ke daftar
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun BestAnimeApp(navController: NavController) {
    AnimeList(animeList = DataSource().loadAnimes(), navController = navController)
}

@Composable
fun AnimeList(animeList: List<Anime>, navController: NavController, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(animeList) { anime ->
            AnimeCard(anime = anime, modifier = Modifier.padding(8.dp)) {
                // Navigasi ke layar detail
                navController.navigate("anime_detail/${animeList.indexOf(anime)}")
            }
        }
    }
}

@Composable
fun AnimeCard(anime: Anime, modifier: Modifier = Modifier, onClick: () -> Unit) {
    Card(modifier = modifier, onClick = onClick) {
        Column {
            Image(
                painter = painterResource(anime.imageResourceId),
                contentDescription = stringResource(anime.stringResourceId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = LocalContext.current.getString(anime.stringResourceId),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}