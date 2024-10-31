package com.example.recyclerview

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.recyclerview.ui.theme.RecyclerViewTheme

class MainActivity : ComponentActivity() {
    private val colorsData: ArrayList<ColorData> = ArrayList<ColorData>();


    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        for (i in 0..10) {
            colorsData.add(
                ColorData(
                    colorName = "Color №$i",
                    colorHex = i * 3 * 9 * 50000 - 16000000
                )
            );
        }


        super.onCreate(savedInstanceState)
        setContent {
            RecyclerViewTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    MainScreen(colorsData)
                }
            }
        }
    }
}

@Composable
fun MainScreen(colorsData: ArrayList<ColorData>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 50.dp),
        verticalArrangement = Arrangement.Center
    ) {
        items(colorsData) { Item(it.colorName, it.colorHex) }
    }
}

@Composable
fun Item(color: String, hexColor: Int) {

    Row {
        Box(
            modifier = Modifier
                .background(color = Color(hexColor))
                .size(50.dp)
        )
        Text(
            text = color,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 12.dp)
        )

    }
}

data class ColorData(val colorName: String, val colorHex: Int) {}