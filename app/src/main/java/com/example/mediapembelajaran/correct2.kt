package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class correct2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_correct2)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, quiz3::class.java))
        }, 4000)
    }
}