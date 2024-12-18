package com.example.menuwithcleanachitecture.Data.BD

import com.example.menuwithcleanachitecture.Domain.Basket.BasketDao
import com.example.menuwithcleanachitecture.Domain.models.Dishs

class BasketDaoImpl:BasketDao{
    private val dishes = mutableListOf<DishEntity>()//имитация базы данных

    override fun addDish(dishs: Dishs) {
        val dishEntity = DishEntity(dishs.id,dishs.id,dishs.url_dish,dishs.name_dish,dishs.price_dish,
            dishs.countPrice,dishs.weight_dish,dishs.quantity)
        dishes.add(dishEntity)// сохраняем блюдо в базе данных
        print("Блюдо добавлено:$dishEntity")
    }

    override fun minusDish(id: Dishs) {
        TODO()
    }

    override fun plusDish(id: Dishs) {
        TODO("Not yet implemented")
    }

    override fun getAllDishes(): List<Dishs> {
        TODO("Not yet implemented")
    }

    override fun updateDishes(dishs: Dishs) {
        TODO("Not yet implemented")
    }

    override fun deliteDish(id: Dishs) {
        TODO("Not yet implemented")
    }


}