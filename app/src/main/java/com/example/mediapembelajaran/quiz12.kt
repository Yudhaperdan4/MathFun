package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class quiz12 : AppCompatActivity() {
    private lateinit var jawaban121 : ImageView
    private lateinit var jawaban122 : ImageView
    private lateinit var jawaban123 : ImageView
    private lateinit var jawaban124 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz12)
        jawaban121 = findViewById(R.id.jawaban121)
        jawaban122 = findViewById(R.id.jawaban122)
        jawaban123 = findViewById(R.id.jawaban123)
        jawaban124 = findViewById(R.id.jawaban124)

        jawaban121.setOnClickListener {
            startActivity(Intent(this, wrong12::class.java))
        }
        jawaban122.setOnClickListener {
            startActivity(Intent(this, wrong12::class.java))
        }
        jawaban123.setOnClickListener {
            startActivity(Intent(this, wrong12::class.java))
        }
        jawaban124.setOnClickListener {
            startActivity(Intent(this, correct12::class.java))
        }
    }
}