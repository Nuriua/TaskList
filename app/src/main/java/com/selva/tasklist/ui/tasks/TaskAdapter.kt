package com.selva.tasklist.ui.tasks

import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.selva.tasklist.data.Task
import com.selva.tasklist.databinding.ItemTaskBinding

class TaskAdapter : ListAdapter<Task, > {
    class TaskViewHolder(private val binding: ItemTaskBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(task: Task){
            binding.apply {

            }
        }
    }
}