package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.DishsItem

class MinusDeliteDishUseCase(private val repository: BasketDishsListRepository) {

    //   уменьшает на 1 или удаляет выбранное блюдо если количество меньше 1
    suspend fun execute(id: DishsItem) {
        return repository.minusDish(id)
    }
}