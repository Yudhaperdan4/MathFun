package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class wrong17 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wrong17)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, latihan4::class.java))
        }, 4000)
    }
}