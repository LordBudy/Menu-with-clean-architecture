package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.DishsItem

class UpdateDishesUseCase(private val repository: BasketDishsListRepository) {

    //    обновляет список блюд в корзине после любых действий удаление или прибавление
    suspend fun execute(dishsItem: DishsItem) {
        return repository.updateDishes(dishsItem)
    }
}