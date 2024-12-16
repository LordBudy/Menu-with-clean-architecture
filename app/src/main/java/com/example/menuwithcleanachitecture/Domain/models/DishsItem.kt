package com.example.menuwithcleanachitecture.Domain.models
//модель блюда
data class DishsItem(
    val dishId: Int,
    val imageUrl: String,
    val name: String,
    val price: Int,
    val weight: Int,
    val description: String,
    var count: Int
)
