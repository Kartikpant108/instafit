package com.example.fitnessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class beiggnerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beiggner)

        val firstActButton = findViewById<Button>(R.id.idPushUp)
        firstActButton.setOnClickListener {
            val intent = Intent(this, PushUpDetail::class.java)
            startActivity(intent)
        }

        val SecondActButton = findViewById<Button>(R.id.idPullUp)
        SecondActButton.setOnClickListener {
            val intent = Intent(this, PullUpDetail::class.java)
            startActivity(intent)
        }

        val ThirdActButton = findViewById<Button>(R.id.idSkipRope)
        ThirdActButton.setOnClickListener {
            val intent = Intent(this, SkipRopeDetail::class.java)
            startActivity(intent)
        }

        val FourthActButton = findViewById<Button>(R.id.idSquat)
        FourthActButton.setOnClickListener {
            val intent = Intent(this, SquatDetail::class.java)
            startActivity(intent)
        }

        val FifthActButton = findViewById<Button>(R.id.idPlank)
        FifthActButton.setOnClickListener {
            val intent = Intent(this, PlankDetail::class.java)
            startActivity(intent)
        }
    }
}