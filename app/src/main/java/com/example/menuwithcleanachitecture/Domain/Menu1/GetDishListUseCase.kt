package com.example.menuwithcleanachitecture.Domain.Menu1

import com.example.menuwithcleanachitecture.Domain.models.DishsItem

class GetDishListUseCase(private val menu1DishListRepository: Menu1DishListRepository) {

//выводит лист с меню определенной категории (для всех категорий один список)
    fun getDishsList(): List<DishsItem>{
        return menu1DishListRepository.getDishsList()
    }
}