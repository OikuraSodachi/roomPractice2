package com.todokanai.roompractice.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.todokanai.roompractice.service.MyService
import com.todokanai.roompractice.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ContextCompat.getSystemService(this, MyService::class.java)    //----- 서비스 개시



    }
}