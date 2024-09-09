package com.example.todoapp;
import android.app.Application

import com.example.todoapp.db.TodoDatabase;

class MainApplication {
    companion object{
        lateinit var todoDatabase:
        TodoDatabase
    }
    override fun onCreate() {
        super.onCreate()
        Room.databaseBuilder(
                applicationContext,
                TodoDatabase::class.java,
                TodoDatabase.NAME

        ).build()
    }

}
