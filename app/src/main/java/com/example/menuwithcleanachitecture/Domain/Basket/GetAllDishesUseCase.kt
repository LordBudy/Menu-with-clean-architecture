package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.DishsItem

class GetAllDishesUseCase(private val repository: BasketDishsListRepository) {

    //Выводит список блюд в корзине если есть если нет то просто пустой список
    suspend fun execute(): List<DishsItem> {
        return repository.getAllDishes()
    }
}