package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class quiz8 : AppCompatActivity() {
    private lateinit var jawaban81 : ImageView
    private lateinit var jawaban82 : ImageView
    private lateinit var jawaban83 : ImageView
    private lateinit var jawaban84 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz8)
        jawaban81 = findViewById(R.id.jawaban81)
        jawaban82 = findViewById(R.id.jawaban82)
        jawaban83 = findViewById(R.id.jawaban83)
        jawaban84 = findViewById(R.id.jawaban84)

        jawaban81.setOnClickListener {
            startActivity(Intent(this, correct8::class.java))
        }
        jawaban82.setOnClickListener {
            startActivity(Intent(this, wrong8::class.java))
        }
        jawaban83.setOnClickListener {
            startActivity(Intent(this, wrong8::class.java))
        }
        jawaban84.setOnClickListener {
            startActivity(Intent(this, wrong8::class.java))
        }
    }
}