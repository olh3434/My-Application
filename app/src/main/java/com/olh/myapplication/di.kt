package com.olh.myapplication.di

import android.content.Context
import androidx.room.Room
import com.olh.myapplication.data.local.HabitDatabase
import com.olh.myapplication.data.repository.HabitRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): HabitDatabase {
        return Room.databaseBuilder(
            context,
            HabitDatabase::class.java,
            "habit_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideRepository(db: HabitDatabase): HabitRepository {
        return HabitRepository(db.habitDao())
    }
}
