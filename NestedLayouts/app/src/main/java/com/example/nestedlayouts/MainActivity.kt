package com.example.nestedlayouts

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nestedlayouts.ui.theme.NestedLayoutsTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NestedLayoutsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    MainScreen()
                }
            }
        }
    }
}


@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        HorizontalContainer()
        VerticalContainer()
        ConstraintContainer()
    }
}


@Composable
fun HorizontalContainer() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(
                80.dp
            )
            .background(color = Color.LightGray),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = "TextView"
        )
        Text(
            text = "TextView"
        )
        Text(
            text = "TextView"
        )
    }

}

@Composable
fun VerticalContainer() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(
                80.dp
            )
            .background(color = Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "TextView"
        )
        Text(
            text = "TextView"
        )
        Text(
            text = "TextView"
        )
    }

}

@Composable
fun ConstraintContainer() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(
                80.dp
            )
            .background(color = Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row() {
            Text(
                text = "TextView",
                Modifier
                    .padding(10.dp),
                color = Color.White
            )
            Text(
                text = "TextView",
                Modifier
                    .padding(10.dp),
                color = Color.White
            )
        }

        Text(
            text = "TextView",
            color = Color.White
        )
    }

}

