package com.example.menuwithcleanachitecture.Domain.Menu1

import com.example.menuwithcleanachitecture.Domain.models.DishItem

class GetDishListUseCase(private val menu1Repository: Menu1Repository) {

    //выводит лист с меню определенной категории (для всех категорий один список)
    suspend fun getDishsList(): List<DishItem> {
        return menu1Repository.getDishsList()
    }

}