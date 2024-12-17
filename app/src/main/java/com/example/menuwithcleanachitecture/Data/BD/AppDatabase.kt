package com.example.menuwithcleanachitecture.Data.BD

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.menuwithcleanachitecture.Data.BasketDaoData

@Database(entities = [DishEntity::class], version = 1)//Указывает, какие данные Entityиспользовались в базе данных.
abstract class AppDatabase : RoomDatabase() {
    abstract fun basketDao(): BasketDaoData // Room использует этот метод, чтобы создать реализацию BasketDao
}