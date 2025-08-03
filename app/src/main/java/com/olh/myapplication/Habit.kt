package com.olh.myapplication.model

import com.olh.myapplication.data.local.HabitEntity

data class Habit(
    val id: Int = 0,
    val title: String,
    val description: String,
    val isCompleted: Boolean = false
) {
    fun toEntity(): HabitEntity {
        return HabitEntity(id, title, description, isCompleted)
    }
}
