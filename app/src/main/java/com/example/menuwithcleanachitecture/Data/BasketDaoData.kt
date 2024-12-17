package com.example.menuwithcleanachitecture.Data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.menuwithcleanachitecture.Data.BD.DishEntity

//DAO - это интерфейс, который определяет методы доступа
// к данным (запросы, вставка, удаление, обновление)
@Dao
interface BasketDaoData {
        //  обновили
        @Update
        suspend fun updateDish(dish: DishEntity) // обновляет список блюд после каждого действия с бд
        //  вывели
        @Query("SELECT * FROM dishs") //извлечение всех записей из таблицы dishs из бд
        suspend fun getAllDish(): List<DishEntity>
        //  добавили
        @Insert
        suspend fun insertDish(dish: DishEntity) // добавление блюда в бд
        //  удалили
        @Delete
        suspend fun deleteDish(dish: DishEntity) //удаляет блюдо из бд

//suspend- указывает, что функция является корутиной и будет работать асинхронно.

}