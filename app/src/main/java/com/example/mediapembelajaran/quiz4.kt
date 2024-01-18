package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class quiz4 : AppCompatActivity() {
    private lateinit var jawaban41 : ImageView
    private lateinit var jawaban42 : ImageView
    private lateinit var jawaban43 : ImageView
    private lateinit var jawaban44 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz4)
        jawaban41 = findViewById(R.id.jawaban41)
        jawaban42 = findViewById(R.id.jawaban42)
        jawaban43 = findViewById(R.id.jawaban43)
        jawaban44 = findViewById(R.id.jawaban44)

        jawaban41.setOnClickListener {
            startActivity(Intent(this, correct4::class.java))
        }
        jawaban42.setOnClickListener {
            startActivity(Intent(this, wrong4::class.java))
        }
        jawaban43.setOnClickListener {
            startActivity(Intent(this, wrong4::class.java))
        }
        jawaban44.setOnClickListener {
            startActivity(Intent(this, wrong4::class.java))
        }
    }
}