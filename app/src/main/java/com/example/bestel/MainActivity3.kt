package com.example.bestel

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val knop3 = findViewById<ImageView>(R.id.knop5)
        knop3.setOnClickListener {
            finish()
        }
        val pizza = findViewById<ImageView>(R.id.pizza_foto)
        val pizzatext = findViewById<TextView>(R.id.pizza_text)
        val foto = intent.getIntExtra("plaatje",0)
        val naam = intent.getStringExtra("pizzatext")

        if (foto != 0) {
            pizza.setImageResource(foto)
            pizzatext.setText(naam)
        }

    }

}