package com.example.composestate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composestate.ui.theme.ComposeStateTheme
import com.example.composestate.WellnessScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeStateTheme {
                
                Surface(modifier =Modifier.fillMaxSize(),
                    color =MaterialTheme.colorScheme.background
                ){
                    WellnessScreen(modifier = Modifier)
                }
                }
            }
        }
    }



@Preview(showBackground = true)
@Composable
fun WellnessScreenPreview() {
    ComposeStateTheme {
        WellnessScreen(modifier = Modifier)
    }
}
