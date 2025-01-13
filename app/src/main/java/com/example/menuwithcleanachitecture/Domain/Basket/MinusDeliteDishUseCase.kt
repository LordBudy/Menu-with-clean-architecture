package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.DishItem

class MinusDeliteDishUseCase(private val repository: BasketDishsListRepository) {

    //   уменьшает на 1 или удаляет выбранное блюдо если количество меньше 1
    suspend fun execute(id: Int): DishItem {
        return repository.minusDish(id)
    }
}