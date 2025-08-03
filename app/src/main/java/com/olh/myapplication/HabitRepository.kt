package com.olh.myapplication.data.repository

import com.olh.myapplication.data.local.HabitDao
import com.olh.myapplication.model.Habit
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class HabitRepository(private val habitDao: HabitDao) {

    fun getAllHabits(): Flow<List<Habit>> =
        habitDao.getAllHabits().map { list -> list.map { it.toHabit() } }

    suspend fun insertHabit(habit: Habit) {
        habitDao.insertHabit(habit.toEntity())
    }

    suspend fun deleteHabit(habit: Habit) {
        habitDao.deleteHabit(habit.toEntity())
    }

    suspend fun updateHabit(habit: Habit) {
        habitDao.updateHabit(habit.toEntity())
    }
}
