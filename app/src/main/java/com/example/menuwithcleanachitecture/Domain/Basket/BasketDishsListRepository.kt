package com.example.menuwithcleanachitecture.Domain.Basket

import androidx.lifecycle.LiveData
import com.example.menuwithcleanachitecture.Domain.models.DishItem

interface BasketDishsListRepository {

    //Уменьшает количество блюд в корзине -1 до последнего если
    // кол-во равно1 и снова вызывается метод -1 то кол-во становится равно 0
    //и вызывается метод удаления этой позиции
    suspend fun minusDish(id: Int): DishItem

    //Прибавляет кол-во блюд в корзине +1
    suspend fun plusDish(id: Int): DishItem

    //Выводит список блюд в корзине если такие есть если нет
    // то возвращает пустую страницу
    suspend fun getAllDishes():List<DishItem>

    //удаляет позицию полностью если количество любой позиции блюд стало =0
    //и вызывается метод обновления списка
    suspend fun deliteDish(id: Int): DishItem?

    //добавляет новое блюдо в корзину
    suspend fun addDishToBasket(id: Int): DishItem

}