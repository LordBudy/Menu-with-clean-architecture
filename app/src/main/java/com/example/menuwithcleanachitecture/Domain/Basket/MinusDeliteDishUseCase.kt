package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.Dishs

class MinusDeliteDishUseCase(private val dishDao: BasketDaoDomain) {

//   уменьшает на 1 или удаляет выбранное блюдо если количество меньше 1
    fun minusDish(id: Dishs){

        return dishDao.minusDish(id)
    }
}