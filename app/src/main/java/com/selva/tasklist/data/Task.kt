package com.selva.tasklist.data

data class Task(
    val name:String,
    val important: Boolean = false,
    val completed: Boolean = false,
){
}