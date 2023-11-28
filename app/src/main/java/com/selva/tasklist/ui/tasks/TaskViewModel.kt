package com.selva.tasklist.ui.tasks

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.selva.tasklist.data.TaskDao

class TaskViewModel @ViewModelInject constructor(
    private val taskDao: TaskDao
) : ViewModel() {
}