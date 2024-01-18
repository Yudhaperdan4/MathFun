package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class quiz15 : AppCompatActivity() {
    private lateinit var jawaban151 : ImageView
    private lateinit var jawaban152 : ImageView
    private lateinit var jawaban153 : ImageView
    private lateinit var jawaban154 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz15)
        jawaban151 = findViewById(R.id.jawaban151)
        jawaban152 = findViewById(R.id.jawaban152)
        jawaban153 = findViewById(R.id.jawaban153)
        jawaban154 = findViewById(R.id.jawaban154)

        jawaban151.setOnClickListener {
            startActivity(Intent(this, wrong15::class.java))
        }
        jawaban152.setOnClickListener {
            startActivity(Intent(this, wrong15::class.java))
        }
        jawaban153.setOnClickListener {
            startActivity(Intent(this, correct15::class.java))
        }
        jawaban154.setOnClickListener {
            startActivity(Intent(this, wrong15::class.java))
        }
    }
}