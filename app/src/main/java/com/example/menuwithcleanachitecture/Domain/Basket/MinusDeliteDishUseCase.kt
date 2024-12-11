package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.DishsItem

class MinusDeliteDishUseCase(private val basketDishsListRepository: BasketDishsListRepository) {

//   уменьшает на 1 или удаляет выбранное блюдо если количество меньше 1
    fun minusDeliteDish(dishId: Int): DishsItem{
        return basketDishsListRepository.minusDeliteDish(dishId)
    }
}