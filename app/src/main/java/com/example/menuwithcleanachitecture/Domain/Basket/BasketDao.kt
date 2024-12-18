package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.Dishs


//интерфейс -описывает методы которые будут использоваться для доступа к данным
interface BasketDao {
    //если такого блюда нет то добавляем новое
    fun addDish(dishs: Dishs)
    //Удаляет блюда из корзины по 1 если это последнее то

    fun minusDish(id: Dishs)

    //Прибавляет кол-во блюд в корзине
    fun plusDish(id: Dishs)

    //Выводит список блюд в корзине если такие есть если нет
    // то возвращает пустую страницу
    fun getAllDishes(): List<Dishs>

    //обновляет список блюд в корзине после любых действий удаление или прибавление
    fun updateDishes(dishs: Dishs)

    //удаляет позицию полностью
    fun deliteDish(id: Dishs)
}