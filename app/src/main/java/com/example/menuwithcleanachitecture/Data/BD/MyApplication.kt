package com.example.menuwithcleanachitecture.Data.BD

import android.app.Application
import androidx.room.Room

class MyApplication : Application() {
    val database by lazy { //используем lazy для того, чтобы база данных создавалась только тогда, когда она нам понадобилась.
        Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "app_database"
        ).build()
    }
}