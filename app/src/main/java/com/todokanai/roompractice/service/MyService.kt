package com.todokanai.roompractice.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import com.todokanai.roompractice.application.MyApplication
import com.todokanai.roompractice.repository.UserRepository
import com.todokanai.roompractice.room.User
import com.todokanai.roompractice.room.UserDatabase
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MyService : Service() {

    companion object{
        lateinit var userListInfo : List<User>
    }

    private val userRepository = UserRepository(UserDatabase.getInstance(MyApplication.appContext).userDao())

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onCreate() {
        super.onCreate()
        userRepository.getUsers().observeForever(){
            userListInfo = it
            Log.d("service","$userListInfo")
        }
    }
}