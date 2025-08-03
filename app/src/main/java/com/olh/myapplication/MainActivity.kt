package com.olh.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.olh.myapplication.ui.theme.MyApplicationTheme
import com.olh.myapplication.ui.HabitApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                HabitApp()
            }
        }
    }
}
