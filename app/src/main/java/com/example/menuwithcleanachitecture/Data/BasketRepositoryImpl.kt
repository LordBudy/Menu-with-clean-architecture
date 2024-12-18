package com.example.menuwithcleanachitecture.Data

import com.example.menuwithcleanachitecture.Data.BD.BasketDao
import com.example.menuwithcleanachitecture.Data.BD.DishEntity
import com.example.menuwithcleanachitecture.Domain.Basket.BasketDishsListRepository
import com.example.menuwithcleanachitecture.Domain.models.DishsItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class BasketRepositoryImpl(private val basketDao: BasketDao) : BasketDishsListRepository {

    override suspend fun minusDish(id: Int): DishsItem = withContext(Dispatchers.IO) {
        val basketEntity = basketDao.getBasketDish(id) ?: return@withContext DishsItem(
            id, "", "",
            "0", 0, "", 0
        )
        if (basketEntity.quantity < 1) {
            basketDao.deleteBasketItem(id)
        } else {
            val updateDish = basketEntity.copy(quantity = basketEntity.quantity - 1)
            basketDao.updateBasket(updateDish)
        }
        return@withContext basketEntity.toDishsItem()
    }

    override suspend fun plusDish(id: Int): DishsItem = withContext(Dispatchers.IO) {
        val basketEntity = basketDao.getBasketDish(id) ?: return@withContext DishsItem(
            id, "", "",
            "", 0, "", 0
        )
        val updateDish = basketEntity.copy(quantity = basketEntity.quantity + 1)
        basketDao.updateBasket(updateDish)
        return@withContext updateDish.toDishsItem()

    }

    override suspend fun getAllDishes(): List<DishsItem> = withContext(Dispatchers.IO){
        basketDao.getAllBasket().map { it.toDishsItem() }
    }

    override suspend fun deliteDish(id: Int): DishsItem? = withContext(Dispatchers.IO){
        val basketEntity = basketDao.getBasketDish(id)?: return@withContext null
        basketDao.deleteBasketItem(id)
        return@withContext basketEntity.toDishsItem()
    }
    private fun DishEntity.toDishsItem() : DishsItem = DishsItem(id ?: 0, url,name,
        price.toString(),
        countPrice,weight, quantity)

}