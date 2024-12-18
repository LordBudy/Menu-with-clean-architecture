package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.Dishs

class DeliteDishUseCase(private val basketDao: BasketDao) {

    suspend fun execute(id: Dishs){
        return basketDao.deliteDish(id)
    }
}