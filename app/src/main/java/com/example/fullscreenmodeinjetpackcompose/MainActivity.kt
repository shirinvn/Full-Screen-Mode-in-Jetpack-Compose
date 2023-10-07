package com.example.fullscreenmodeinjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.example.fullscreenmodeinjetpackcompose.ui.theme.FullScreenModeinJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window,false)
        setContent {
            FullScreenModeinJetpackComposeTheme {
                // A surface container using the 'background' color from the theme

                    Greeting()

            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting() {

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        contentWindowInsets = WindowInsets(0.dp,0.dp, 0.dp, 0.dp),)
    {paddingValues->

        Column(modifier = Modifier.padding(paddingValues)) {

        }
        Text(
            modifier = Modifier.padding(top = 50.dp),
            text = "Hello"
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FullScreenModeinJetpackComposeTheme {
        Greeting()
    }
}