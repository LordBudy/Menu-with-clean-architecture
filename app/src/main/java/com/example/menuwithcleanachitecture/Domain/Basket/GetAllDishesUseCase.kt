package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.DishItem

class GetAllDishesUseCase(private val repository: BasketDishsListRepository) {

    //Выводит список блюд в корзине если есть если нет то просто пустой список
    suspend fun execute(): List<DishItem> {
        return repository.getAllDishes()
    }
}