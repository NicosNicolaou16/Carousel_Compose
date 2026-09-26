package com.nicos.carousel_compose.data.room_database.init_database

import android.content.Context
import androidx.room3.Database
import androidx.room3.Room
import androidx.room3.RoomDatabase
import com.nicos.carousel_compose.data.room_database.entities.PokemonEntity
import com.nicos.carousel_compose.data.room_database.entities.daos.PokemonDao

@Database(
    entities = [PokemonEntity::class],
    version = 1,
    exportSchema = false
)
abstract class MyRoomDatabase : RoomDatabase() {

    abstract fun pokemonDao(): PokemonDao

    companion object {
        private const val DB_NAME = "pokemon"
        fun initDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                MyRoomDatabase::class.java,
                DB_NAME
            ).build()
    }
}