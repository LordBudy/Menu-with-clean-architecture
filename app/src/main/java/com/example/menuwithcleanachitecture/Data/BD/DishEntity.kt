package com.example.menuwithcleanachitecture.Data.BD

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "dishes") //  таблица будет называться "dishs"
data class DishEntity(

    @PrimaryKey(autoGenerate = true)
    var idAvto: Int? = null,

    @ColumnInfo(name = "id_dish")
    var id: Int?,

    @ColumnInfo(name = "url")
    var url: String,

    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "price")
    var price: Int,

    @ColumnInfo(name = "countPrice")
    var countPrice: Int,

    @ColumnInfo(name = "weight")
    var weight: String,

    @ColumnInfo(name = "quantity")
    var quantity: Int

)
