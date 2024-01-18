package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import com.example.mediapembelajaran.databinding.ActivityCorrect1Binding

class correct1 : AppCompatActivity() {
    private lateinit var binding: ActivityCorrect1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCorrect1Binding.inflate(layoutInflater)
        setContentView(R.layout.activity_correct1)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, quiz2::class.java))
        }, 4000)
    }
}