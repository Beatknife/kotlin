package com.yahyabulat.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yahyabulat.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.hsl(
                        hue = 125f,
                        saturation = 0.32f,
                        lightness = 0.87f
                    )
                ) {
                    BusinessCardApp(
                        logo = painterResource(id = R.drawable.android_logo),
                        name = "Yahya Bulat",
                        title = "Android Developer",
                        phoneNumber = "+90 551 122 39 51",
                        socialMedia = "@yahyabulat",
                        mailAddress = "yahyabulat5@gmail.com"
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp(
    logo: Painter,
    name: String,
    title: String,
    phoneNumber: String,
    socialMedia: String,
    mailAddress: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            PersonalInfo(
                logo = logo,
                name = name,
                title = title,
                modifier = Modifier
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.3f)
                .padding(20.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom
        ) {
            ContactInfo(
                phoneNumber = phoneNumber,
                socialMedia = socialMedia,
                mailAddress = mailAddress,
                modifier = Modifier
            )
        }
    }
}

@Composable
fun PersonalInfo(
    logo: Painter,
    name: String,
    title: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Image(
            painter = logo,
            modifier = Modifier
                .padding(bottom = 8.dp)
                .size(125.dp)
                .background(Color.hsl(
                    hue = 198f,
                    saturation = 0.81f,
                    lightness = 0.14f
                )),
            contentDescription = null
        )
        Text(
            text = name,
            fontSize = 48.sp,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = title,
            fontSize = 24.sp,
            color = Color.hsl(
                hue = 152f,
                saturation = 1f,
                lightness = 0.21f),
            modifier = Modifier
        )
    }
}

@Composable
fun ContactInfo(
    phoneNumber: String,
    socialMedia: String,
    mailAddress: String,
    modifier: Modifier = Modifier
){
    Column {
        Row(
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.call_24dp_78a75a),
                contentDescription = null
            )

            Text(
                text = phoneNumber,
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        Row(
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.share_24dp_78a75a),
                contentDescription = null
            )

            Text(
                text = socialMedia,
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        Row(
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.email_24dp_78a75a),
                contentDescription = null
            )

            Text(
                text = mailAddress,
                modifier = Modifier.padding(start = 8.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.hsl(
            hue = 125f,
            saturation = 0.32f,
            lightness = 0.87f)
    ) {
        BusinessCardApp(
            logo = painterResource(id = R.drawable.android_logo),
            name = "Yahya Bulat",
            title = "Android Developer",
            phoneNumber = "+90 551 122 39 51",
            socialMedia = "@yahyabulat",
            mailAddress = "yahyabulat5@gmail.com"
        )
    }
}