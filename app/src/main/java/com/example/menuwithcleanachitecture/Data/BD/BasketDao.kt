package com.example.menuwithcleanachitecture.Data.BD

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


//DAO - это интерфейс, который определяет методы доступа
// к данным (запросы, вставка, удаление, обновление)
@Dao
interface BasketDao {
//  обновили
    @Update
    suspend fun updateDish(dishId: DishEntity) // обновляет список блюд после каждого действия с бд
//  вывели
    @Query("SELECT * FROM dishs") //извлечение всех записей из таблицы dishs из бд
    suspend fun getAllDish(dishId: Int): List<DishEntity>
//  добавили
    @Insert
    suspend fun insertDish(dishId: Int) // добавление блюда в бд
//  удалили
    @Delete
    suspend fun deleteDish(dishId: Int) //удаляет блюдо из бд

//suspend- указывает, что функция является корутиной и будет работать асинхронно.
}