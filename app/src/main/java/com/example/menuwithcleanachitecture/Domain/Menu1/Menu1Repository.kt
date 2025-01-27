package com.example.menuwithcleanachitecture.Domain.Menu1

import com.example.menuwithcleanachitecture.Domain.models.DishItem

interface Menu1Repository {

//Выводит список блюд с фото
   suspend fun getDishsList(): List<DishItem>

//Закрывает мини окно и возвращает в предидущее меню
   suspend fun backToMenu()
}