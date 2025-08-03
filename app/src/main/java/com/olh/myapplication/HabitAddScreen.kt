package com.olh.myapplication.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.olh.myapplication.model.Habit
import com.olh.myapplication.viewmodel.HabitViewModel

@Composable
fun HabitAddScreen(
    viewModel: HabitViewModel = viewModel(),
    onHabitAdded: () -> Unit
) {
    var title by remember { mutableStateOf(TextFieldValue("")) }
    var description by remember { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(text = "Yeni Alışkanlık Ekle", style = MaterialTheme.typography.headlineSmall)

        OutlinedTextField(
            value = title,
            onValueChange = { title = it },
            label = { Text("Başlık") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = description,
            onValueChange = { description = it },
            label = { Text("Açıklama") },
            modifier = Modifier.fillMaxWidth()
        )

        Button(
            onClick = {
                val habit = Habit(
                    title = title.text,
                    description = description.text
                )
                viewModel.addHabit(habit) // ✅ ViewModel'daki doğru fonksiyon
                onHabitAdded()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Kaydet")
        }
    }
}
