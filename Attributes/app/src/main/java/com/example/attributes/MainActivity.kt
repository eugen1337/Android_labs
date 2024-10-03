package com.example.attributes

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.attributes.ui.theme.AttributesTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AttributesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {

                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        MainScreen()
                    }
                }
            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf("") }
    var color by remember { mutableStateOf(Color.Black) }
    var size by remember { mutableStateOf(16.sp) }
    var bgColor by remember { mutableStateOf(Color.White) }


    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Label") },
        textStyle = TextStyle(
            color = color, fontSize = size, background =
            bgColor
        )
    );

    Row {
        Column {
            Button(
                onClick = {
                    color = Color.Black
                }
            ) { Text(text = "Черный текст") };
            Button(
                onClick = {
                    size = 8.sp
                }
            ) { Text(text = "Размер - 8SP") };
            Button(
                onClick = {
                    bgColor = Color.White
                }
            ) { Text(text = "Белый фон") };
        };
        Column {
            Button(
                onClick = {
                    color = Color.Red
                }
            ) { Text(text = "Красный текст") };
            Button(
                onClick = {
                    size = 24.sp
                }
            ) { Text(text = "Размер - 24SP") };
            Button(
                onClick = {
                    bgColor = Color.Yellow
                }
            ) { Text(text = "Желтый фон") };
        };
    }
}


