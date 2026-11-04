package com.example.bestel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageView


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val knop2 = findViewById<ImageView>(R.id.image)
        knop2.setOnClickListener {
            finish()
        }

        val knop7 = findViewById<ImageView>(R.id.imageView7)
        knop7.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        val knop3 = findViewById<ImageView>(R.id.imageView3)
        knop3.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        val knop4 = findViewById<ImageView>(R.id.imageView4)
        knop4.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        val knop9 = findViewById<ImageView>(R.id.imageView9)
        knop9.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        val knop10 = findViewById<ImageView>(R.id.imageView10)
        knop10.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        val knop11 = findViewById<ImageView>(R.id.imageView11)
        knop11.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        val knop12 = findViewById<ImageView>(R.id.imageView12)
        knop12.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        val koop = findViewById<Button>(R.id.button)
        koop.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        val plaatje = findViewById<ImageView>(R.id.imageView5)

        val knop5 = findViewById<ImageView>(R.id.imageView5)

        knop5.setOnClickListener {

            val intent = Intent(this, MainActivity3::class.java)

            intent.putExtra("plaatje", R.drawable.pizza_slami)
            intent.putExtra("pizzatext", "PIZZA SALAMI ")
            intent.putExtra("pizzainfo", "PIZZA met salami ")
            intent.putExtra("pizzaprijs", "15,00 ")
            startActivity(intent)
        }

        val knop6 = findViewById<ImageView>(R.id.imageView7)

        knop6.setOnClickListener {

            val intent = Intent(this, MainActivity3::class.java)

            intent.putExtra("plaatje", R.drawable._1)
            intent.putExtra("pizzatext", "PIZZA SUPER DUPER SALAMI ")
            intent.putExtra("pizzainfo", "PIZZA met super duper veel salami ")
            intent.putExtra("pizzaprijs", "€45,00 ")
            startActivity(intent)
        }


    }





    }
