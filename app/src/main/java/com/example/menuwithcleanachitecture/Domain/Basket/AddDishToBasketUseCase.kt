package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.DishsItem

class AddDishToBasketUseCase(private val repository: BasketDishsListRepository) {

    //    прибавляет одно блюдо к уже имеющемуся или создает новое
    suspend fun plusDish(dishId: Int): DishsItem {

        return repository.plusDish(dishId)
    }
}