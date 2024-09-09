package com.example.todoapp.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import com.example.todoapp.Todo

@Dao
interface ToDoDao {
    @Query("SELECT * FROM TODO")
    fun getAllToDo() : LiveData<List<Todo>>

    annotation class Query(val value: String)

    @Insert
    fun addToDO(todo : Todo)

    annotation class Insert

    @Query("Delete FROM ToDo where id = :id")
    fun deleteToDO(id : Int)
}