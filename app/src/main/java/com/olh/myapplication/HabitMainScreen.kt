package com.olh.myapplication.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.olh.myapplication.ui.components.HabitItem
import com.olh.myapplication.viewmodel.HabitViewModel
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HabitMainScreen(viewModel: HabitViewModel = viewModel()) {
    val habits by viewModel.habits.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Habit Tracker") })
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp)
        ) {
            items(habits.size) { index ->
                HabitItem(habit = habits[index])
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}
