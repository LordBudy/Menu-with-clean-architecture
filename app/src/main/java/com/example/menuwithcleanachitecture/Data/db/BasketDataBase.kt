package com.example.menuwithcleanachitecture.Data.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [DishEntity::class], version = 1, exportSchema = false)
abstract class BasketDataBase : RoomDatabase() {
    abstract fun basketDao(): BasketDao
}