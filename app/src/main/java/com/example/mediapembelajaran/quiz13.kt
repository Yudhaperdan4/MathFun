package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class quiz13 : AppCompatActivity() {
    private lateinit var jawaban131 : ImageView
    private lateinit var jawaban132 : ImageView
    private lateinit var jawaban133 : ImageView
    private lateinit var jawaban134 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz13)
        jawaban131 = findViewById(R.id.jawaban131)
        jawaban132 = findViewById(R.id.jawaban132)
        jawaban133 = findViewById(R.id.jawaban133)
        jawaban134 = findViewById(R.id.jawaban134)

        jawaban131.setOnClickListener {
            startActivity(Intent(this, wrong13::class.java))
        }
        jawaban132.setOnClickListener {
            startActivity(Intent(this, correct13::class.java))
        }
        jawaban133.setOnClickListener {
            startActivity(Intent(this, wrong13::class.java))
        }
        jawaban134.setOnClickListener {
            startActivity(Intent(this, wrong13::class.java))
        }
    }
}