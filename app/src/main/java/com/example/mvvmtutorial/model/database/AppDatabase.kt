package com.example.mvvmtutorial.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mvvmtutorial.model.Post
import com.example.mvvmtutorial.model.PostDao

@Database(entities = [Post::class], version = 1)
abstract class AppDatabase: RoomDatabase() {

    abstract fun postDao(): PostDao

}