package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.DishsItem

interface BasketDishsListRepository {

    //Уменьшает количество блюд в корзине -1
    suspend fun minusDish(id: Int): DishsItem

    //Прибавляет кол-во блюд в корзине +1
    suspend fun plusDish(id: Int): DishsItem

    //Выводит список блюд в корзине если такие есть если нет
    // то возвращает пустую страницу
    suspend fun getAllDishes(): List<DishsItem>

    //удаляет позицию полностью если количество одного блюда <1
    suspend fun deliteDish(id: Int): DishsItem?
}