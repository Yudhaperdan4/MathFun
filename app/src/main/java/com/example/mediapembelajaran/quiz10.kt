package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class quiz10 : AppCompatActivity() {
    private lateinit var jawaban101 : ImageView
    private lateinit var jawaban102 : ImageView
    private lateinit var jawaban103 : ImageView
    private lateinit var jawaban104 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz10)
        jawaban101 = findViewById(R.id.jawaban101)
        jawaban102 = findViewById(R.id.jawaban102)
        jawaban103 = findViewById(R.id.jawaban103)
        jawaban104 = findViewById(R.id.jawaban104)

        jawaban101.setOnClickListener {
            startActivity(Intent(this, wrong10::class.java))
        }
        jawaban102.setOnClickListener {
            startActivity(Intent(this, correct10::class.java))
        }
        jawaban103.setOnClickListener {
            startActivity(Intent(this, wrong10::class.java))
        }
        jawaban104.setOnClickListener {
            startActivity(Intent(this, wrong10::class.java))
        }
    }
}