package com.example.menuwithcleanachitecture.Data

import com.example.menuwithcleanachitecture.Data.BD.BasketDao
import com.example.menuwithcleanachitecture.Domain.Basket.BasketDishsListRepository
import com.example.menuwithcleanachitecture.Domain.models.DishsItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

//Класс, который реализует интерфейс репозитория BasketDishsListRepository
// и использует DAO для доступа к базе данных.
//Также в конструкторе он получает basketDao
class BasketListRepositoryImpl(private val basketDao: BasketDao): BasketDishsListRepository {
    override fun minusDish(dishId: Int): DishsItem {
        TODO("Not yet implemented")
    }

    override fun plusDish(dishId: Int): DishsItem {
        TODO("Not yet implemented")
    }

    override fun getBasketList(): List<DishsItem> {
        TODO("Not yet implemented")
    }


}