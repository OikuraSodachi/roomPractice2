package com.todokanai.roompractice.repository

import androidx.lifecycle.asLiveData
import com.todokanai.roompractice.room.User
import com.todokanai.roompractice.room.UserDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(private val userDao: UserDao) {

    fun getUsers() = userDao.getAll().asLiveData()

    suspend fun insert(user : User){
        userDao.insert(user)
    }

    suspend fun delete(user : User){
        userDao.delete(user)
    }


}