package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.DishItem

class DeliteDishUseCase(private val repository: BasketDishsListRepository) {

    suspend fun delite(id: Int): DishItem? {
        return repository.deliteDish(id)
    }
}