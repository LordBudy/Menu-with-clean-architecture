package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.Dishs

class UpdateDishesUseCase(private val dishDao: BasketDao) {

    //    обновляет список блюд в корзине после любых действий удаление или прибавление
    suspend fun execute(dishs: Dishs) {
        return dishDao.updateDishes(dishs)
    }
}