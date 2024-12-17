package com.example.menuwithcleanachitecture.Data.BD

import com.example.menuwithcleanachitecture.Data.BasketDao

class BasketDaoImpl(private val basketDao: BasketDao) : BasketDao {

    override suspend fun updateDish(dish: DishEntity) = basketDao.updateDish(dish)
    override suspend fun getAllDish(): List<DishEntity> = basketDao.getAllDish()
    override suspend fun insertDish(dish: DishEntity) = basketDao.insertDish(dish)
    override suspend fun deleteDish(dish: DishEntity) = basketDao.deleteDish(dish)


}