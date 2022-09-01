package com.example.basiccodelabcompose.state

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.basiccodelabcompose.ui.theme.MyStateTheme

class StateActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MyStateApp() }
    }
}

@Composable
fun MyStateApp() {
    MyStateTheme {

    }
}
