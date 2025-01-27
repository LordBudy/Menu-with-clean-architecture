package com.example.menuwithcleanachitecture.Domain.Menu1.MiniWindow

import com.example.menuwithcleanachitecture.Domain.Basket.BasketDishsListRepository
import com.example.menuwithcleanachitecture.Domain.models.DishItem

class AddSaveDishToBasketUseCase(private val repository: BasketDishsListRepository) {

    suspend fun addDishSave(id: Int) :DishItem{
        return repository.addDishToBasket(id)
    }


}