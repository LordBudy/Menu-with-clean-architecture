package com.example.menuwithcleanachitecture.Domain.Basket

import com.example.menuwithcleanachitecture.Domain.models.Dishs


//интерфейс -описывает методы которые будут использоваться для доступа к данным
interface BasketDaoDomain {
    //Удаляет блюда из корзины по 1 если это последнее то
//    удаляет позицию полностью
    fun minusDish(id: Dishs)

    //Прибавляет кол-во блюд в корзине
    fun plusDish(id: Dishs)

    //Выводит список блюд в корзине если такие есть если нет
    // то возвращает пустую страницу
    fun getBasketList(): List<Dishs>
}