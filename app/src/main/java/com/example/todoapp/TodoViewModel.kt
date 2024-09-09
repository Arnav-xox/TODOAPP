package com.example.todoapp

import android.icu.text.CaseMap.Title
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todoapp.db.ToDoDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.time.Instant
import java.util.Date

class TodoViewModel : ViewModel() {

    val ToDoDao = MainApplication.todoDatabase.getToDoDao()

    val todoList : LiveData<List<Todo>> = ToDoDao.getAllToDo



    @RequiresApi(Build.VERSION_CODES.O)
    fun addTodo(title: String){
        viewModelScope.launch(Dispatchers.IO){
            ToDoDao.addTodo(Todo(title = title, createdAt = Date.from(Instant.now())))
        }


    }
    fun deleteTodo(id : Int){
        viewModelScope.launch(Dispatchers.IO) {
            ToDoDao.deleteTodo(id)
        }


    }
}