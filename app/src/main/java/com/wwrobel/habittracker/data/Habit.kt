package com.wwrobel.habittracker.data

data class Habit(
    val id: Int,
    val name: String,
    val isCompleted: Boolean = false
)
