package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.Dishs

class MinusDeliteDishUseCase(private val dishDao: BasketDao) {

    //   уменьшает на 1 или удаляет выбранное блюдо если количество меньше 1
    suspend fun execute(id: Dishs) {
        return dishDao.minusDish(id)
    }
}