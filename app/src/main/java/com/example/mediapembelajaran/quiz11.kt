package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class quiz11 : AppCompatActivity() {
    private lateinit var jawaban111 : ImageView
    private lateinit var jawaban112 : ImageView
    private lateinit var jawaban113 : ImageView
    private lateinit var jawaban114 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz11)
        jawaban111 = findViewById(R.id.jawaban111)
        jawaban112 = findViewById(R.id.jawaban112)
        jawaban113 = findViewById(R.id.jawaban113)
        jawaban114 = findViewById(R.id.jawaban114)

        jawaban111.setOnClickListener {
            startActivity(Intent(this, wrong11::class.java))
        }
        jawaban112.setOnClickListener {
            startActivity(Intent(this, correct11::class.java))
        }
        jawaban113.setOnClickListener {
            startActivity(Intent(this, wrong11::class.java))
        }
        jawaban114.setOnClickListener {
            startActivity(Intent(this, wrong11::class.java))
        }
    }
}