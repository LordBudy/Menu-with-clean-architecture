package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.DishItem

interface BasketDishsListRepository {

    //Уменьшает количество блюд в корзине -1
    suspend fun minusDish(id: Int): DishItem

    //Прибавляет кол-во блюд в корзине +1
    suspend fun plusDish(id: Int): DishItem

    //Выводит список блюд в корзине если такие есть если нет
    // то возвращает пустую страницу
    suspend fun getAllDishes(): List<DishItem>

    //удаляет позицию полностью если количество одного блюда <1
    suspend fun deliteDish(id: Int): DishItem?

    //обновляет весь список корзины
 //   suspend fun updateDishes(dishItem: DishItem): List<DishItem>
}