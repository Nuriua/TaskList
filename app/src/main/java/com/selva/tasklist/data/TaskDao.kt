package com.selva.tasklist.data

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface TaskDao {
    @Insert
    suspend fun insert(task: Task)
}