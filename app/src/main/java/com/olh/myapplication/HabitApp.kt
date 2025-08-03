package com.olh.myapplication.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.olh.myapplication.ui.screen.HabitMainScreen

@Composable
fun HabitApp() {
    Surface(color = MaterialTheme.colorScheme.background) {
        HabitMainScreen()
    }
}
