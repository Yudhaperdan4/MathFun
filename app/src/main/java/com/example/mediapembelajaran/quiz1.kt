package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class quiz1 : AppCompatActivity() {
    private lateinit var jawaban12 : ImageView
    private lateinit var jawaban11 : ImageView
    private lateinit var jawaban13 : ImageView
    private lateinit var jawaban14 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz1)
        jawaban12 = findViewById(R.id.jawaban12)
        jawaban11 = findViewById(R.id.jawaban11)
        jawaban13 = findViewById(R.id.jawaban13)
        jawaban14 = findViewById(R.id.jawaban14)

        jawaban12.setOnClickListener {
            startActivity(Intent(this, correct1::class.java))
        }
        jawaban11.setOnClickListener {
            startActivity(Intent(this, wrong1::class.java))
        }
        jawaban13.setOnClickListener {
            startActivity(Intent(this, wrong1::class.java))
        }
        jawaban14.setOnClickListener {
            startActivity(Intent(this, wrong1::class.java))
        }
    }
}