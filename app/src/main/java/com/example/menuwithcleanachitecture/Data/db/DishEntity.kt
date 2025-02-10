package com.example.menuwithcleanachitecture.Data.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "dishes") //  таблица будет называться "dishs"
data class DishEntity(

    @PrimaryKey
    @ColumnInfo(name = "id_dish")
    var id: Int,

    @ColumnInfo(name = "url")
    var url: String,

    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "price")
    var price: Double,

    @ColumnInfo(name = "countPrice")
    var countPrice: Double,

    @ColumnInfo(name = "weight")
    var weight: String,

    @ColumnInfo(name = "quantity")
    val quantity: Int

)
