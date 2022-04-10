package com.example.workoutapp.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query


@Dao
interface WorkoutDao {

    @Query("SELECT * FROM WORKOUTS")
    fun getAllWorkouts(): List<Workout>

    @Query("SELECT * FROM WORKOUTS A WHERE A.WORKOUT_ID IN (:workOutIds)")
    fun getAllWorkouts(workOutIds: IntArray): List<Workout>

    @Insert
    fun insert(vararg workouts: Workout)

    @Delete
    fun deleteWorkout(workout: Workout)

    @Query("DELETE FROM WORKOUTS")
    fun deleteAll()

}