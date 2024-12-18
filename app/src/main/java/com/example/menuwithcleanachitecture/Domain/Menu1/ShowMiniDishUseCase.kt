package com.example.menuwithcleanachitecture.Domain.Menu1

import com.example.menuwithcleanachitecture.Domain.models.DishsItem

class ShowMiniDishUseCase(private val menu1DishListRepository: Menu1DishListRepository) {

//    открывает мини окно с фотографией блюда и полным описанием
    fun showMiniDish(dishId: Int): DishsItem{
        return menu1DishListRepository.showMiniDish(dishId)
    }
}