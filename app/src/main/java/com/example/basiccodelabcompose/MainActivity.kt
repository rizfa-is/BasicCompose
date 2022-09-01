package com.example.basiccodelabcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.basiccodelabcompose.basic.MyBasicApp
import com.example.basiccodelabcompose.layout.MyLayoutApp
import com.example.basiccodelabcompose.ui.theme.BasicCodelabComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicCodelabComposeTheme {
                MyBasicApp()
            }
        }
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
fun MyLayoutAppPreview() {
    MyLayoutApp()
}