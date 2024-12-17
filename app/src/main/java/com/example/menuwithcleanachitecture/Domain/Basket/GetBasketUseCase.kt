package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.Dishs

class GetBasketUseCase(private val dishDao: BasketDaoDomain) {

    //Выводит список блюд в корзине если есть если нет то просто пустой список
    suspend fun getBasketList(): List<Dishs> {

        return dishDao.getBasketList()
    }
}