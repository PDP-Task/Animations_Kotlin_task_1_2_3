package com.example.animationskotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.dynamicanimation.animation.DynamicAnimation
import androidx.dynamicanimation.animation.SpringAnimation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image: ImageView = findViewById(R.id.image_main)
        val btnBounce: Button = findViewById(R.id.btn_bounce)
        val btnSequential: Button = findViewById(R.id.btn_sequential)
        val btnTogether: Button = findViewById(R.id.btn_together)

        val bounce = AnimationUtils.loadAnimation(this, R.anim.bounce)
        val sequential = AnimationUtils.loadAnimation(this, R.anim.squential)
        val together = AnimationUtils.loadAnimation(this, R.anim.togather)

        btnBounce.setOnClickListener {
            image.startAnimation(bounce)
        }
        btnSequential.setOnClickListener {
            image.startAnimation(sequential)
        }
        btnTogether.setOnClickListener {
            image.startAnimation(together)
        }
    }
}