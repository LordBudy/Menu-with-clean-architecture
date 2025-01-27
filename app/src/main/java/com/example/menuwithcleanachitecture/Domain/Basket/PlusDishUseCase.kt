package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.DishItem

class PlusDishUseCase(private val repository: BasketDishsListRepository) {

    //    прибавляет одно блюдо к уже имеющемуся или создает новое
    suspend fun plus(id: Int): DishItem {
        return repository.plusDish(id)
    }
}