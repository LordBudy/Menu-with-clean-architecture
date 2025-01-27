package com.example.menuwithcleanachitecture.Domain.Category1

import com.example.menuwithcleanachitecture.Domain.models.DishItem

class ShowMiniDishUseCase(private val categoryRepository: CategoryListRepository) {

    //    открывает мини окно с фотографией блюда и полным описанием
    suspend fun showMiniDish(dishId: Int): DishItem {
        return categoryRepository.showMiniDish(dishId)
    }

}