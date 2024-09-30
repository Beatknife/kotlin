package com.yahyabulat.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yahyabulat.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                ArtSpaceApp()
            }
        }
    }
}

@Composable
fun ArtSpaceApp() {
    var currentArtwork by remember { mutableStateOf(R.drawable.monalisa) }
    var currentTitle by remember { mutableStateOf(R.string.title_mona_lisa) }
    var currentArtistInfo by remember { mutableStateOf(R.string.artist_leonardo) }

    var step by remember { mutableStateOf(1) }

    Column(
        modifier = Modifier
            .padding(top = 130.dp)
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .wrapContentSize()
                .shadow(
                    elevation = 8.dp,
                    shape = RoundedCornerShape(2.dp)
                )
                .size(width = 300.dp, height = 450.dp)
                .background(Color.White)
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(currentArtwork),
                contentDescription = null,
                modifier = Modifier.wrapContentSize(),
                contentScale = ContentScale.FillBounds
            )
        }
        Spacer(
            modifier = Modifier.padding(top = 50.dp)
        )
        ArtworkInfo(
            modifier = Modifier
                .padding(horizontal = 32.dp)
                .fillMaxWidth()
                .background(Color(red = 236, green = 235, blue = 244)),
            title = stringResource(currentTitle),
            artistName = stringResource(currentArtistInfo),
        )
        Row(
            modifier = Modifier
                .padding(22.dp)
                .fillMaxWidth(),
            Arrangement.SpaceBetween
        ) {
            Button(
                onClick = {
                    if (step == 1) {
                        step = 3
                    } else if (step == 2) {
                        step = 1
                    } else if (step == 3) {
                        step = 2
                    }
                    when (step) {
                        1 -> {
                            currentArtwork = R.drawable.monalisa
                            currentTitle = R.string.title_mona_lisa
                            currentArtistInfo = R.string.artist_leonardo
                        }
                        2 -> {
                            currentArtwork = R.drawable.scream
                            currentTitle = R.string.title_scream
                            currentArtistInfo = R.string.artist_edvard
                        }
                        3 -> {
                            currentArtwork = R.drawable.tortoisetrainer
                            currentTitle = R.string.title_tortoise_trainer
                            currentArtistInfo = R.string.artist_osman
                        }
                    }
                },
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 8.dp),
                shape = RoundedCornerShape(4.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(red = 108, green = 37, blue = 190)
                )
            ) {
                Text(text = stringResource(id = R.string.previous))
            }

            Button(
                onClick = {
                    if (step == 1) {
                        step = 2
                    } else if (step == 2) {
                        step = 3
                    } else if (step == 3) {
                        step = 1
                    }
                    when (step) {
                        1 -> {
                            currentArtwork = R.drawable.monalisa
                            currentTitle = R.string.title_mona_lisa
                            currentArtistInfo = R.string.artist_leonardo
                        }
                        2 -> {
                            currentArtwork = R.drawable.scream
                            currentTitle = R.string.title_scream
                            currentArtistInfo = R.string.artist_edvard
                        }
                        3 -> {
                            currentArtwork = R.drawable.tortoisetrainer
                            currentTitle = R.string.title_tortoise_trainer
                            currentArtistInfo = R.string.artist_osman
                        }
                    }
                },
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 8.dp),
                shape = RoundedCornerShape(4.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(red = 108, green = 37, blue = 190)
                )
            ) {
                Text(text = stringResource(id = R.string.next))
            }
        }
    }
}

@Composable
fun ArtworkInfo(
    modifier: Modifier = Modifier,
    title: String,
    artistName: String,
) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = title,
            modifier = Modifier
                .padding(top = 8.dp, bottom = 4.dp, start = 8.dp, end = 8.dp),
            color = Color.Black,
            textAlign = TextAlign.Start,
            fontSize = 24.sp
        )

        Text(
            text = artistName,
            modifier = Modifier.padding(top = 0.dp, bottom = 8.dp, start = 8.dp, end = 8.dp),
            color = Color.Gray,
            textAlign = TextAlign.Start
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtSpaceTheme {
        ArtSpaceApp()
    }
}
