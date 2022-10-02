package com.example.explicit_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var textsecond:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        textsecond = findViewById(R.id.text_second)
        val intent=getIntent()

        val n1:String ?= intent.getStringExtra("MainActivity1")
        textsecond.text=n1
    }
}