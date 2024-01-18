package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class quiz9 : AppCompatActivity() {
    private lateinit var jawaban91 : ImageView
    private lateinit var jawaban92 : ImageView
    private lateinit var jawaban93 : ImageView
    private lateinit var jawaban94 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz9)
        jawaban91 = findViewById(R.id.jawaban91)
        jawaban92 = findViewById(R.id.jawaban92)
        jawaban93 = findViewById(R.id.jawaban93)
        jawaban94 = findViewById(R.id.jawaban94)

        jawaban91.setOnClickListener {
            startActivity(Intent(this, wrong9::class.java))
        }
        jawaban92.setOnClickListener {
            startActivity(Intent(this, wrong9::class.java))
        }
        jawaban93.setOnClickListener {
            startActivity(Intent(this, correct9::class.java))
        }
        jawaban94.setOnClickListener {
            startActivity(Intent(this, wrong9::class.java))
        }
    }
}