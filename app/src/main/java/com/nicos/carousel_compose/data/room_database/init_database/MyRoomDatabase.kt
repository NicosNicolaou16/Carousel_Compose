package com.nicos.carousel_compose.data.room_database.init_database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.nicos.carousel_compose.data.room_database.entities.PokemonEntity
import com.nicos.carousel_compose.data.room_database.entities.daos.PokemonDao

@Database(
    entities = [PokemonEntity::class,],
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