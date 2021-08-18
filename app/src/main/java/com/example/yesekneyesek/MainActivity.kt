package com.example.yesekneyesek

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.yesekneyesek.models.Meal
import com.example.yesekneyesek.ui.theme.YesekNeYesekTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YesekNeYesekTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting(Meal("soup",2))
                }
            }
        }
    }
}

@Composable
fun Greeting(tempMeal: Meal) {
    Column {
        Text(text = "Hello ${tempMeal.name}!")
        Text(text = "type: ${tempMeal.type}")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    YesekNeYesekTheme {
        Greeting(Meal("Soup",2))
    }
}