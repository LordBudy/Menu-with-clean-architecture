package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.DishsItem
//интерфейс репозитория
interface BasketDishsListRepository {

    //Удаляет блюда из корзины по 1 если это последнее то
//    удаляет позицию полностью
    fun minusDish(dishId: Int): DishsItem

    //Прибавляет кол-во блюд в корзине
    fun plusDish(dishId: Int): DishsItem

//Выводит список блюд в корзине если такие есть если нет то пустая страница
    fun getBasketList(): List<DishsItem>
}