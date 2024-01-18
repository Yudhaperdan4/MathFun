package com.example.mediapembelajaran

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class quiz14 : AppCompatActivity() {
    private lateinit var jawaban141 : ImageView
    private lateinit var jawaban142 : ImageView
    private lateinit var jawaban143 : ImageView
    private lateinit var jawaban144 : ImageView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz14)
        jawaban141 = findViewById(R.id.jawaban141)
        jawaban142 = findViewById(R.id.jawaban142)
        jawaban143 = findViewById(R.id.jawaban143)
        jawaban144 = findViewById(R.id.jawaban144)

        jawaban141.setOnClickListener {
            startActivity(Intent(this, correct14::class.java))
        }
        jawaban142.setOnClickListener {
            startActivity(Intent(this, wrong14::class.java))
        }
        jawaban143.setOnClickListener {
            startActivity(Intent(this, wrong14::class.java))
        }
        jawaban144.setOnClickListener {
            startActivity(Intent(this, wrong14::class.java))
        }
    }
}