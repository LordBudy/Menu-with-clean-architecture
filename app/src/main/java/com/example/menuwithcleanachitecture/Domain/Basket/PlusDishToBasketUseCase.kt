package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.Dishs

class PlusDishToBasketUseCase(private val dishDao: BasketDaoDomain) {

    //    прибавляет одно блюдо к уже имеющемуся или создает новое
    suspend fun plusDish(id: Dishs) {

        return dishDao.plusDish(id)
    }
}