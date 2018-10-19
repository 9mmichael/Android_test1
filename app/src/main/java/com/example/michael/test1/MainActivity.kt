package com.example.michael.test1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Buttonの宣言
        val button: Button = findViewById(R.id.buttonTrans)

        //Intentの宣言
        val intent: Intent = Intent(this@MainActivity, ArticlesActivity::class.java)

        //Button(IDがbuttonTrans)をタップされたときの処理
        button.setOnClickListener {
            startActivity(intent)
        }

        //test2
    }
}
