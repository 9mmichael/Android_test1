package com.example.michael.test1

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

@SuppressLint("Registered")
class ArticlesActivity : AppCompatActivity(){

        @SuppressLint("MissingSuperCall")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_articles)
        }
}