package com.example.menuwithcleanachitecture.Data

import androidx.lifecycle.LiveData
import com.example.menuwithcleanachitecture.Data.db.BasketDao
import com.example.menuwithcleanachitecture.Data.db.DishEntity
import com.example.menuwithcleanachitecture.Domain.Basket.BasketDishsListRepository
import com.example.menuwithcleanachitecture.Domain.models.DishItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject


class BasketRepositoryImpl @Inject constructor(private val basketDao: BasketDao) : BasketDishsListRepository {

    override suspend fun minusDish(id: Int): DishItem = withContext(Dispatchers.IO) {
        val basketEntity = basketDao.getBasketItem(id) ?: return@withContext DishItem(
            id, "", "",
            "0", 0, "", 0
        )
        if (basketEntity.quantity < 1) {
            basketDao.deleteBasketItem(id)
        } else {
            val updateDish = basketEntity.copy(quantity = basketEntity.quantity - 1)
            basketDao.updateBasket(updateDish)
        }
        //Преобразуем DishEntity в DishItem и возвращаем
        return@withContext basketEntity.toDishsItem()
    }

    override suspend fun plusDish(id: Int): DishItem = withContext(Dispatchers.IO) {
        val basketEntity = basketDao.getBasketItem(id) ?: return@withContext DishItem(
            id, "", "",
            "", 0, "", 0
        )
        val updateDish = basketEntity.copy(quantity = basketEntity.quantity + 1)
        basketDao.updateBasket(updateDish)
        return@withContext updateDish.toDishsItem()

    }
//получаем все DishEntity из бд, и мапим их в список DishItem
    override suspend fun getAllDishes(): List<DishItem> = withContext(Dispatchers.IO){
        basketDao.getAllBasket().map { it.toDishsItem() }
    }

    override suspend fun deliteDish(id: Int): DishItem? = withContext(Dispatchers.IO){
        val basketEntity = basketDao.getBasketItem(id) ?: return@withContext null
        basketDao.deleteBasketItem(id)
        return@withContext basketEntity.toDishsItem()
    }

    override suspend fun addDishToBasket(id: Int): DishItem = withContext(Dispatchers.IO) {
        val basketEntity = basketDao.getBasketItem(id) ?: return@withContext DishItem(
            id, "", "",
            "", 0, "", 0
        )
        val updateDish = basketEntity.copy(quantity = 1)
        basketDao.updateBasket(updateDish)
        return@withContext updateDish.toDishsItem()
    }


    // Это функция расширения, которая преобразует `DishEntity` в `DishItem`
    private fun DishEntity.toDishsItem() : DishItem = DishItem(id ?: 0, url,name,
        price.toString(),
        countPrice,weight, quantity)



}
