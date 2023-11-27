package com.selva.tasklist.di

import android.app.Application
import androidx.room.Room
import com.selva.tasklist.data.TaskDatabase
import dagger.Provides

object AppModule {
    @Provides
    fun provideDatabase(
        app: Application
    ) = Room.databaseBuilder(app, TaskDatabase::class.java, "task_database")
            .fallbackToDestructiveMigration()
            .build()

    @Provides
    fun provideTaskDao(db: TaskDatabase) = db.taskDao()
}