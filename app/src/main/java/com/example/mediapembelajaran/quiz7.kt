package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class quiz7 : AppCompatActivity() {
    private lateinit var jawaban71 : ImageView
    private lateinit var jawaban72 : ImageView
    private lateinit var jawaban73 : ImageView
    private lateinit var jawaban74 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz7)
        jawaban71 = findViewById(R.id.jawaban71)
        jawaban72 = findViewById(R.id.jawaban72)
        jawaban73 = findViewById(R.id.jawaban73)
        jawaban74 = findViewById(R.id.jawaban74)

        jawaban71.setOnClickListener {
            startActivity(Intent(this, wrong7::class.java))
        }
        jawaban72.setOnClickListener {
            startActivity(Intent(this, wrong7::class.java))
        }
        jawaban73.setOnClickListener {
            startActivity(Intent(this, wrong7::class.java))
        }
        jawaban74.setOnClickListener {
            startActivity(Intent(this, correct7::class.java))
        }
    }
}