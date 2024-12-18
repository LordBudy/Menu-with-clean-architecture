package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.DishsItem

class DeliteDishUseCase(private val repository: BasketDishsListRepository) {

    suspend fun execute(id: DishsItem){
        return repository.deliteDish(id)
    }
}