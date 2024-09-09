package com.example.todoapp.db

@Database(entities = [Todo::class],version = 1)
@TypeConverters(Converters::class)
abstract class TodoDatabase : RoomDatabase() {
    companion object {
        const val NAME = "TodoDB"
    }
    abstract fun getToDoDao() : ToDoDao
}

annotation class Database
