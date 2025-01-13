package com.example.menuwithcleanachitecture.Data.db

import androidx.room.Database
import androidx.room.RoomDatabase

//@Database- аннотация, которая связывает entity c dao.
@Database(entities = [DishEntity::class], version = 1)

//класс представляет наши исходные данные
abstract class BasketDataBase: RoomDatabase() {

//абстрактный метод, для получения дао.
    abstract fun basketDao(): BasketDao

}