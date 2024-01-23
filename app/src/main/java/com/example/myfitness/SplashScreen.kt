package com.example.myfitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val logo = findViewById<ImageView>(R.id.logo)
        val Animation = AnimationUtils.loadAnimation(this,R.anim.scale)
        logo.startAnimation(Animation)
        android.os.Handler(Looper.getMainLooper())
            .postDelayed(
                {
                    startActivity(Intent(this,MainActivity::class.java))
                    finish()
                },30000
            )
    }
}