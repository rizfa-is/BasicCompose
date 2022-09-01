package com.example.basiccodelabcompose.layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basiccodelabcompose.R
import com.example.basiccodelabcompose.layout.ui.element.*
import com.example.basiccodelabcompose.ui.theme.MyLayoutTheme

class LayoutActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MyLayoutApp() }
    }
}

@Composable
fun MyLayoutApp() {
    MyLayoutTheme {
        Scaffold(
            bottomBar = { MyLayoutBottomNavigation() }
        ) { paddingValues ->
            HomeScreen(Modifier.padding(paddingValues))
        }
    }
}


@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun SearchBarPreview() {
    MyLayoutTheme {
        SearchBar(Modifier.padding(8.dp))
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun AlignYourBodyElementPreview() {
    MyLayoutTheme {
        AlignYourBodyElement(
            R.drawable.ab1_inversions,
            R.string.ab1_inversions,
            Modifier.padding(8.dp)
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun AlignYourBodyRowPreview() {
    MyLayoutTheme {
        AlignYourBodyRow(Modifier.padding(vertical = 8.dp))
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun FavoriteCollectionCardPreview() {
    MyLayoutTheme {
        FavoriteCollectionCard(
            R.drawable.fc2_nature_meditations,
            R.string.fc2_nature_meditations,
            Modifier.padding(8.dp)
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun FavoriteCollectionGridPreview() {
    MyLayoutTheme {
        FavoriteCollectionGrid(Modifier.padding(vertical = 8.dp))
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun HomeSectionPreview() {
    MyLayoutTheme {
        HomeSection(title = R.string.align_your_body) {
            AlignYourBodyRow()
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2, heightDp = 180)
@Composable
fun HomeScreenPreview() {
    MyLayoutTheme {
        HomeScreen()
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun MyLayoutBottomNavigationPreview() {
    MyLayoutTheme {
        MyLayoutBottomNavigation(Modifier.padding(top = 16.dp))
    }
}


@Preview(widthDp = 360, heightDp = 640)
@Composable
fun MyLayoutAppPreview() {
    MyLayoutApp()
}