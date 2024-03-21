package com.example.application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.application.ui.theme.ApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),

                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(Color(0xfff8bbd0)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val image = painterResource(id = R.drawable.icon)
        Image(
            painter = image,
            contentDescription = "Android Logo",
            modifier = Modifier
                .height(120.dp)
                .width(150.dp)
        )
        Text(text = "Rebeca Mendes", color = Color.White, fontSize = 32.sp)
        Text(text = "Aplicação e Revisão", color = Color(0xFF880E4F))
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 50.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start
    ) {
        Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp)
        ) {
            Text(
                text = "Etec Zona Leste",
                color = Color.White,
                modifier = Modifier.padding(8.dp)
            )

        }
        Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp)
        ) {

            Text(
                text = "Desenvolvimento de Sistemas",
                color = Color.White,
                modifier = Modifier.padding(8.dp)
            )

        }
        Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp)

        ) {

            Text(
                text = "Introdução a Kotlin",
                color = Color.White,
                modifier = Modifier.padding(8.dp)
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ApplicationTheme {
        BusinessCard()
    }
}