package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.DishItem

class MinusDishUseCase(private val repository: BasketDishsListRepository) {

    //   уменьшает на 1 или удаляет выбранное блюдо если количество меньше 1
    suspend operator fun invoke(dishItem: DishItem): DishItem {
        return repository.minusDish(dishItem.id)
    }
}