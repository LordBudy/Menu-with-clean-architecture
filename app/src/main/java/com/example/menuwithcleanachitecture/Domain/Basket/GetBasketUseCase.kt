package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.DishsItem

class GetBasketUseCase(private val basketDishsListRepository: BasketDishsListRepository) {

//Выводит список блюд в корзине
    fun getBasketList(): List<DishsItem>{
        return basketDishsListRepository.getBasketList()
    }
}