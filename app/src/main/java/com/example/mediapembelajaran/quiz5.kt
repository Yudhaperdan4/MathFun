package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class quiz5 : AppCompatActivity() {
    private lateinit var jawaban51 : ImageView
    private lateinit var jawaban52 : ImageView
    private lateinit var jawaban53 : ImageView
    private lateinit var jawaban54 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz5)
        jawaban51 = findViewById(R.id.jawaban51)
        jawaban52 = findViewById(R.id.jawaban52)
        jawaban53 = findViewById(R.id.jawaban53)
        jawaban54 = findViewById(R.id.jawaban54)

        jawaban51.setOnClickListener {
            startActivity(Intent(this, correct5::class.java))
        }
        jawaban52.setOnClickListener {
            startActivity(Intent(this, wrong5::class.java))
        }
        jawaban53.setOnClickListener {
            startActivity(Intent(this, wrong5::class.java))
        }
        jawaban54.setOnClickListener {
            startActivity(Intent(this, wrong5::class.java))
        }
    }
}