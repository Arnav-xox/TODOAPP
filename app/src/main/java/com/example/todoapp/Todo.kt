package com.example.todoapp

import java.util.Date

@Entity
data class Todo(
    @PrimaryKey(autoGenerate = true)
    var id : Int,
    var title : String,
    var createdAt : Date
)

annotation class PrimaryKey(val autoGenerate: Boolean)

annotation class Entity


