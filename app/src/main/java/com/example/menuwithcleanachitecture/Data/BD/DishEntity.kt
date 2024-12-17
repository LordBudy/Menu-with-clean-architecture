package com.example.menuwithcleanachitecture.Data.BD

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "dishs") //  таблица будет называться "dishs"
data class DishEntity(

@PrimaryKey(autoGenerate = true)
var idAvto: Int? = null,

@ColumnInfo(name = "id_dish")
var id: Int?,

@ColumnInfo(name = "url")
var url_dish: String,

@ColumnInfo(name = "name")
var name_dish: String,

@ColumnInfo(name = "price")
var price_dish: String,

@ColumnInfo(name = "countPrice")
var countPrice: Int,

@ColumnInfo(name = "weight")
var weight_dish: String,

@ColumnInfo(name = "quantity")
var quantity: Int

)
