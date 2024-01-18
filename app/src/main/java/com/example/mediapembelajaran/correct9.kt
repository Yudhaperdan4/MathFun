package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class correct9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_correct9)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, quiz10::class.java))
        }, 4000)
    }
}