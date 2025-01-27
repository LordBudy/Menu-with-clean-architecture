package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.DishItem

class DeleteDishUseCase(private val repository: BasketDishsListRepository) {

    suspend operator fun invoke(dishItem: DishItem): DishItem? {
        return repository.deleteDish(dishItem.id)
    }
}