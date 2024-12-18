package com.example.menuwithcleanachitecture.Domain.Menu1

import com.example.menuwithcleanachitecture.Domain.models.DishsItem

interface Menu1DishListRepository {

//Выводит список блюд с фото
    fun getDishsList(): List<DishsItem>
//Добавляет в корзину, сохраняет в бд выбранное блюдо и закрывает мини окно
    fun saveAddBasketDish(dishId: Int): DishsItem
//Выводит выбранное блюдо в мини окно с подробным описанием
    fun showMiniDish(dishId: Int): DishsItem
//Закрывает мини окно и возвращает в предидущее меню
    fun backToMenu()
}