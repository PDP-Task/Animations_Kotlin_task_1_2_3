package com.example.animationskotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnSecond = findViewById<Button>(R.id.btn_second)
        btnSecond.setOnClickListener {
            onBackPressed()
        }
    }
}