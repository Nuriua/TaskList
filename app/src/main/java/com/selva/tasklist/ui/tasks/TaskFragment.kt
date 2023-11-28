package com.selva.tasklist.ui.tasks

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.selva.tasklist.R
import com.selva.tasklist.ui.tasks.TaskViewModel

class TaskFragment : Fragment(R.layout.fragment_tasks) {
    private val viewModel: TaskViewModel by viewModels()
}