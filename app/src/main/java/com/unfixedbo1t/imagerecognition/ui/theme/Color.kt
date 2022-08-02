package com.unfixedbo1t.imagerecognition.ui.theme

import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)
val ErrorLight = Color(0xFFB00020)

object DarkThemeColors : ColorValues {
    override val primary: Color
        get() = Purple200
    override val primaryVariant: Color
        get() = Purple500
    override val secondary: Color
        get() = Color.Blue
    override val secondaryVariant: Color
        get() = Purple700
    override val background: Color
        get() = Color.White
    override val surface: Color
        get() = Color.White
    override val error: Color
        get() = ErrorLight
    override val onPrimary: Color
        get() = Color.White
    override val onSecondary: Color
        get() = Color.White
    override val onBackground: Color
        get() = Color.Black
    override val onSurface: Color
        get() = Color.Black
    override val onError: Color
        get() = Color.White
}

object LightThemeColors : ColorValues {
    override val primary: Color
        get() = Purple200
    override val primaryVariant: Color
        get() = Purple500
    override val secondary: Color
        get() = Color.Blue
    override val secondaryVariant: Color
        get() = Purple700
    override val background: Color
        get() = Color.White
    override val surface: Color
        get() = Color.White
    override val error: Color
        get() = ErrorLight
    override val onPrimary: Color
        get() = Color.White
    override val onSecondary: Color
        get() = Color.White
    override val onBackground: Color
        get() = Color.Black
    override val onSurface: Color
        get() = Color.Black
    override val onError: Color
        get() = Color.White
}

interface ColorValues {
    val primary: Color
    val primaryVariant: Color
    val secondary: Color
    val secondaryVariant: Color
    val background: Color
    val surface: Color
    val error: Color
    val onPrimary: Color
    val onSecondary: Color
    val onBackground: Color
    val onSurface: Color
    val onError: Color
}

fun getColorsSystem(isNightMode: Boolean): ColorValues {
    return if (isNightMode) DarkThemeColors
    else LightThemeColors
}
