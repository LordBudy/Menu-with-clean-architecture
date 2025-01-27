package com.example.menuwithcleanachitecture.Presentation.Activity

import android.app.Application
import androidx.room.Room
import com.example.menuwithcleanachitecture.Data.db.BasketDataBase

class MyApplication : Application() {
    //Для инициализации базы данных используем Room.databaseBuilder
    val database by lazy {
        Room.databaseBuilder(
            applicationContext,
            BasketDataBase::class.java,
            "basket_database"
        ).build()
    }
}