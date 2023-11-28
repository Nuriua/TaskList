package com.selva.tasklist.ui.tasks

import android.widget.CheckBox
import androidx.core.view.isVisible
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.selva.tasklist.data.Task
import com.selva.tasklist.databinding.ItemTaskBinding

class TaskAdapter : ListAdapter<Task, TaskAdapter.TaskViewHolder> {
    class TaskViewHolder(private val binding: ItemTaskBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(task: Task){
            binding.apply {
                checkBoxCompleted.isChecked = task.completed
                textViewName.text = task.name
                textViewName.paint.isStrikeThruText = task.completed
                labelPriority.isVisible = task.important
            }
        }
    }
}