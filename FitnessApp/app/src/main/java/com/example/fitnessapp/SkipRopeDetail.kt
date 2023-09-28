package com.example.fitnessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.view.View
import android.widget.ImageView
import com.airbnb.lottie.LottieAnimationView
import android.os.Handler



class SkipRopeDetail : AppCompatActivity() {
    private lateinit var anim: LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skip_rope_detail)

        anim = findViewById(R.id.jsonSkipping)
        runAnimationContinuously()
    }

    private fun runAnimationContinuously() {
        anim.visibility = View.VISIBLE
        anim.playAnimation()

        Handler(Looper.getMainLooper()).postDelayed({
            runAnimationContinuously()
        }, anim.duration)
    }
}