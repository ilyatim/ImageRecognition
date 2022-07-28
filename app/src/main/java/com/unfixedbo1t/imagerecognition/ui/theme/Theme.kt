package com.unfixedbo1t.imagerecognition.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = DarkThemeColors.primary,
    primaryVariant = DarkThemeColors.primaryVariant,
    secondary = DarkThemeColors.secondary,
    secondaryVariant = DarkThemeColors.secondaryVariant,
    background = DarkThemeColors.background,
    surface = DarkThemeColors.surface,
    error = DarkThemeColors.error,
    onPrimary = DarkThemeColors.onPrimary,
    onSecondary = DarkThemeColors.onSecondary,
    onBackground = DarkThemeColors.onBackground,
    onSurface = DarkThemeColors.onSurface,
    onError = DarkThemeColors.onError,
)
private val LightColorPalette = lightColors(
    primary = LightThemeColors.primary,
    primaryVariant = LightThemeColors.primaryVariant,
    secondary = LightThemeColors.secondary,
    secondaryVariant = LightThemeColors.secondaryVariant,
    background = LightThemeColors.background,
    surface = LightThemeColors.surface,
    error = LightThemeColors.error,
    onPrimary = LightThemeColors.onPrimary,
    onSecondary = LightThemeColors.onSecondary,
    onBackground = LightThemeColors.onBackground,
    onSurface = LightThemeColors.onSurface,
    onError = LightThemeColors.onError,
)

@Composable
fun MainTheme(
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