package com.example.menuwithcleanachitecture.Data.Repository

import com.example.menuwithcleanachitecture.Data.db.BasketDao
import com.example.menuwithcleanachitecture.Data.db.DishEntity
import com.example.menuwithcleanachitecture.Domain.Basket.BasketDishsListRepository
import com.example.menuwithcleanachitecture.Domain.models.DishItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.withContext
import javax.inject.Inject


class BasketRepositoryImpl @Inject constructor(private val basketDao: BasketDao) : BasketDishsListRepository {

    override suspend fun minusDish(id: Int): DishItem = withContext(Dispatchers.IO) {
        val basketEntityFlow = basketDao.getBasketItem(id)
        val basketEntity = basketEntityFlow.firstOrNull() ?: return@withContext DishItem(
            id, "", "",
            "0", 0.0, "", 0
        )
        if (basketEntity.quantity < 1) {
            basketDao.deleteBasketItem(basketEntity)
        } else {
            val updateDish = basketEntity.copy(quantity = basketEntity.quantity - 1)
            basketDao.updateBasket(updateDish)
        }
        // Преобразуем DishEntity в DishItem и возвращаем
        return@withContext basketEntity.toDishesItem()
    }

    override suspend fun plusDish(id: Int): DishItem = withContext(Dispatchers.IO) {
        val basketEntityFlow = basketDao.getBasketItem(id)
        val basketEntity = basketEntityFlow.firstOrNull() ?: return@withContext DishItem(
            id, "", "",
            "", 0.0, "", 0
        )
        val updateDish = basketEntity.copy(quantity = basketEntity.quantity + 1)
        basketDao.updateBasket(updateDish)
        return@withContext updateDish.toDishesItem()
    }

    //получаем все DishEntity из бд, и мапим их в список DishItem
    override suspend fun getAllDishes(): List<DishItem> = withContext(Dispatchers.IO) {
        basketDao.getAllBasket().firstOrNull()?.map { it.toDishesItem() } ?: emptyList()
    }

    override suspend fun deleteDish(id: Int): DishItem? = withContext(Dispatchers.IO) {
        val basketEntityFlow = basketDao.getBasketItem(id)
        val basketEntity = basketEntityFlow.firstOrNull() ?: return@withContext null
        basketDao.deleteBasketItem(basketEntity)
        return@withContext basketEntity.toDishesItem()
    }

    override suspend fun addDishToBasket(id: Int): DishItem = withContext(Dispatchers.IO) {
        val basketEntityFlow = basketDao.getBasketItem(id)
        val basketEntity = basketEntityFlow.firstOrNull() ?: return@withContext DishItem(
            id, "", "",
            "", 0.0, "", 0
        )
        val updateDish = basketEntity.copy(quantity = 1)
        basketDao.updateBasket(updateDish)
        return@withContext updateDish.toDishesItem()
    }


    // Это функция расширения, которая преобразует `DishEntity` в `DishItem`
    private fun DishEntity.toDishesItem(): DishItem = DishItem(
        id, url, name,
        price.toString(),
        countPrice, weight, quantity
    )


}