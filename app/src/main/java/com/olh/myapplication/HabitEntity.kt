package com.olh.myapplication.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.olh.myapplication.model.Habit

@Entity(tableName = "habits")
data class HabitEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val description: String,
    val isCompleted: Boolean = false
) {
    fun toHabit(): Habit {
        return Habit(id, title, description, isCompleted)
    }
}
