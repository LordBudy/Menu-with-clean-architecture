package com.example.menuwithcleanachitecture.Domain.MiniWindow

import com.example.menuwithcleanachitecture.Domain.Menu1.Menu1DishListRepository
import com.example.menuwithcleanachitecture.Domain.models.DishsItem

class SaveAddBasketDishUseCase(private val menu1DishListRepository: Menu1DishListRepository) {

//добавляет блюдо в корзину и сохнаняет его в бд
    fun saveAddBasketDish(dishId: Int): DishsItem{
        return menu1DishListRepository.saveAddBasketDish(dishId)
    }
}