package com.example.workoutapp.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.zip.DeflaterOutputStream

@Entity(tableName = "WORKOUTS")
data class Workout(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "WORKOUT_ID")
    val id: Int = 0,

    @ColumnInfo(name = "RUN")
    val run_distance: Double = 0.0,

    @ColumnInfo(name = "SWIM")
    val swim_distance: Double = 0.0,

    @ColumnInfo(name = "CALORIE")
    val gain_cals: Double = 0.0) {


    fun getAverageDistance(): Double {
        return (run_distance + swim_distance) / 2
    }

    fun getAverageCalories(): Double {
        return (getTotalDistance() / gain_cals)
    }

    fun getTotalDistance(): Double {
        return run_distance + swim_distance
    }


}


