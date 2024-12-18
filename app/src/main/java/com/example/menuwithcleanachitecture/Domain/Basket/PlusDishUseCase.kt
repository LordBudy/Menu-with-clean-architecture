package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.Dishs

class PlusDishUseCase(private val dishDao: BasketDao) {

    //    прибавляет одно блюдо к уже имеющемуся или создает новое
    suspend fun execute(id: Dishs) {
        return dishDao.plusDish(id)
    }
}