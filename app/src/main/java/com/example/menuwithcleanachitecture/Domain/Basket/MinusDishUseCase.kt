package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.DishItem

class MinusDishUseCase(private val repository: BasketDishsListRepository) {

    //   уменьшает на 1 или удаляет выбранное блюдо если количество меньше 1
    suspend fun minus(id: Int): DishItem {
        return repository.minusDish(id)
    }
}