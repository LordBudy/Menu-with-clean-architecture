package com.example.menuwithcleanachitecture.Domain.MiniWindow

import com.example.menuwithcleanachitecture.Domain.Menu1.Menu1DishListRepository
import com.example.menuwithcleanachitecture.Domain.models.Dishs

class SaveAddBasketDishUseCase(private val menu1DishListRepository: Menu1DishListRepository) {

//добавляет блюдо в корзину и сохнаняет его в бд
    fun saveAddBasketDish(dishId: Int): Dishs{
        return menu1DishListRepository.saveAddBasketDish(dishId)
    }
}