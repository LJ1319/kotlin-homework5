package com.example.workoutapp

import android.app.Application
import androidx.room.Room
import com.example.workoutapp.room.AppDatabase

class App : Application() {

    lateinit var db: AppDatabase

    companion object {
        lateinit var instance: App
            private set
    }

    override fun onCreate() {
        super.onCreate()

        instance = this

        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "DATABASE"
        ).allowMainThreadQueries().build()
    }
}