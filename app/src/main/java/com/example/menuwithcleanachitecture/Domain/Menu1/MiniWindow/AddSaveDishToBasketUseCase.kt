package com.example.menuwithcleanachitecture.Domain.Menu1.MiniWindow

import com.example.menuwithcleanachitecture.Domain.Basket.BasketDishsListRepository
import com.example.menuwithcleanachitecture.Domain.models.DishItem

class AddSaveDishToBasketUseCase(private val repository: BasketDishsListRepository) {

    suspend operator fun invoke(dishItem: DishItem) :DishItem{
        return repository.addDishToBasket(dishItem.id)
    }


}