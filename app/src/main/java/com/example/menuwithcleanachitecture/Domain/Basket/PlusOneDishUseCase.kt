package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.DishsItem

class PlusOneDishUseCase(private val basketDishsListRepository: BasketDishsListRepository) {

//    прибавляет одно блюдо к уже имеющемуся или создает новое
    fun plusOneDish(dishId: Int): DishsItem{
        return basketDishsListRepository.plusOneDish(dishId)
    }
}