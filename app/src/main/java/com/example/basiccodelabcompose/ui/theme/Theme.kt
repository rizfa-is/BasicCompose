package com.example.basiccodelabcompose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Navy,
    primaryVariant = Purple700,
    secondary = Teal200,
    surface = Blue,
    onSurface = Navy,
    onPrimary = Chartreuse
)

private val LightColorPalette = lightColors(
    primary = LightBlue,
    primaryVariant = Purple700,
    secondary = Teal200,
    surface = Blue,
    onSurface = Color.White,
    onPrimary = Navy

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

private val MyLayoutLightColorPalette = lightColors(
    primary = gray900,
    secondary = rust600,
    background = taupe100,
    surface = Color.White.copy(alpha = .85f),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = taupe800,
    onSurface = gray900.copy(alpha = 0.8f)
)

private val MyLayoutDarkColorPalette = darkColors(
    primary = Color.White,
    secondary = rust300,
    background = gray900,
    surface = Color.White.copy(alpha = 0.15f),
    onPrimary = gray900,
    onSecondary = gray900,
    onBackground = taupe100,
    onSurface = Color.White.copy(alpha = .8f)
)

@Composable
fun MyLayoutTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        MyLayoutDarkColorPalette
    } else {
        MyLayoutLightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = MyLayoutTypography,
        shapes = MyLayoutShapes,
        content = content
    )
}

@Composable
fun BasicCodelabComposeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}