package com.example.fitnessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstActButton = findViewById<Button>(R.id.button1)
        firstActButton.setOnClickListener{
            val intent = Intent(this, beiggnerActivity::class.java)
            startActivity(intent)
        }

        val secondActButton = findViewById<Button>(R.id.button2)
        secondActButton.setOnClickListener{
            val intent = Intent(this, beiggnerActivity::class.java)
            startActivity(intent)
        }

        val thirdActButton = findViewById<Button>(R.id.button3)
        thirdActButton.setOnClickListener{
            val intent = Intent(this, beiggnerActivity::class.java)
            startActivity(intent)
        }
    }
}