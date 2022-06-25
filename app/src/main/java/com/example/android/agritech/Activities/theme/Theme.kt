package com.example.android.agritech.Activities.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary= primaryColor,
    primaryVariant= primaryDarkColor,
    secondary= secondaryColor,
    secondaryVariant= secondaryLightColor,
    background= black,
    surface= primaryLightColor,
    error= RedErrorDark,
    onPrimary= white,
    onSecondary= white,
    onBackground= white,
    onSurface= white,
    onError= RedErrorLight,
)

private val LightColorPalette = lightColors(
    primary= primaryColor,
    primaryVariant= primaryLightColor,
    secondary= secondaryColor,
    secondaryVariant= secondaryDarkColor,
    background= white,
    surface= primaryLightColor,
    error= RedErrorDark,
    onPrimary= white,
    onSecondary= white,
    onBackground= black,
    onSurface= black,
    onError= RedErrorLight,

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun AgritechTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
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