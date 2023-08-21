package com.example.composable_use

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedAssistChip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composable_use.ui.theme.Composable_UseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Composable_UseTheme {
                App()
            }
        }
    }
}

@Composable
fun App() {
    Composable_UseTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ExtendedFloatingActionButtonTextSample()
                ElevatedAssistChipSample()
                CardSample()
            }
        }
    }
}

        @Composable
        fun CardSample() {
            Card(Modifier.size(width = 180.dp, height = 100.dp)) {
                // Card content
            }
        }
        @Composable
        fun ExtendedFloatingActionButtonTextSample() {
            ExtendedFloatingActionButton(onClick = { /* do something */ }) {
                Text(text = "Extended FAB")
            }
        }

        @OptIn(ExperimentalMaterial3Api::class)
        @Composable
        fun ElevatedAssistChipSample() {
            ElevatedAssistChip(
                onClick = { /* Do something! */ },
                label = { Text("Assist Chip") },
                leadingIcon = {
                    Icon(
                        Icons.Filled.Settings,
                        contentDescription = "Localized description",
                        Modifier.size(AssistChipDefaults.IconSize)
                    )
                }
            )
        }
        @Composable
        fun Greeting(name: String, modifier: Modifier = Modifier) {
            Text(
                text = "Hello $name!",
                modifier = modifier
            )
        }

        @Preview(showBackground = true)
        @Composable
        fun AppPreview() {
            App()
        }

        @Preview(showBackground = true)
        @Composable
        fun GreetingPreview() {
            Composable_UseTheme {
                Greeting("Android")
            }
        }