package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.Dishs

class GetAllDishesUseCase(private val dishDao: BasketDao) {

    //Выводит список блюд в корзине если есть если нет то просто пустой список
    suspend fun execute(): List<Dishs> {
        return dishDao.getAllDishes()
    }
}