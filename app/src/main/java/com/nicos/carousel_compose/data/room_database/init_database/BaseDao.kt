package com.nicos.carousel_compose.data.room_database.init_database

import androidx.room.*

interface BaseDao<O, L> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrReplaceObject(data: O)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrReplaceList(data: L)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateObject(data: O)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateList(data: L)
}