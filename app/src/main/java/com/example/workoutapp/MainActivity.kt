package com.example.workoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.workoutapp.room.Workout
import com.example.workoutapp.room.WorkoutDao

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val workout = Workout(run_distance = 10.0, swim_distance = 1.0, gain_cals = 10.0)

        App.instance.db.getWorkoutDao().insert(workout)
        App.instance.db.getWorkoutDao().getAllWorkouts().forEach { workout -> Log.d("s1", workout.toString())  }

        val averageDistance = workout.getAverageDistance()
        val averageCalories = workout.getAverageCalories()
        val totalDistance = workout.getTotalDistance()

        Log.d("s1", averageDistance.toString())
        Log.d("s1", averageCalories.toString())
        Log.d("s1", totalDistance.toString())

    }

}