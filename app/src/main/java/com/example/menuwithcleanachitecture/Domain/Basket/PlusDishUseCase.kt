package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.DishsItem

class PlusDishUseCase(private val repository: BasketDishsListRepository) {

    //    прибавляет одно блюдо к уже имеющемуся или создает новое
    suspend fun execute(id: DishsItem) {
        return repository.plusDish(id)
    }
}