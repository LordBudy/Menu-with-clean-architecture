package com.example.menuwithcleanachitecture.Data.BD

import androidx.room.*

//интерфейс -описывает методы которые будут использоваться для доступа к данным
@Dao
interface BasketDao {

    @Insert
    suspend fun insertBasket(dishes: DishEntity)//добавит в бд

    @Query("SELECT * FROM dishes")
    suspend fun getAllBasket(): List<DishEntity>//выведет весь список в бд

    @Query("SELECT * FROM dishes WHERE id_dish = :dishId")//выведет одно блюдо по id
    suspend fun getBasketDish(dishId:Int) : DishEntity?

    @Update
    suspend fun updateBasket(dishes: DishEntity)//обновит бд

    @Delete
    suspend fun deleteBasketAll(dishes: DishEntity)//удалит все из бд

    @Query("DELETE FROM dishes WHERE id_dish = :dishId")//удалить один обьект из бд
    suspend fun deleteBasketItem(dishId: Int) :DishEntity

}