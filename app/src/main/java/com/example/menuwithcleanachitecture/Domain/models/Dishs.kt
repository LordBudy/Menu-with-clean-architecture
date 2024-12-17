package com.example.menuwithcleanachitecture.Domain.models

//модель блюда
data class Dishs(
    val id: Int,
    val url_dish: String,
    val name_dish: String,
    val price_dish: String,
    val countPrice: Int,
    val weight_dish: String,
    val quantity: Int

)
