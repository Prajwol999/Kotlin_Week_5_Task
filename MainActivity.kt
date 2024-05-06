package com.example.myandroid34

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var radioFruits: RadioButton
    lateinit var radioFrize: RadioButton
    lateinit var radioApple: RadioButton
    lateinit var image: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        radioFruits = findViewById(R.id.fruits)
        radioFrize = findViewById(R.id.frize)
        radioApple = findViewById(R.id.apple)
        image = findViewById(R.id.imageView3)

        radioFruits.setOnClickListener {
            image.setImageResource(R.drawable.fruits)


        }
        radioFrize.setOnClickListener {
            image.setImageResource(R.drawable.frize)


        }
        radioApple.setOnClickListener {
            image.setImageResource(R.drawable.apple_logo_1988)
        }
    }
}

