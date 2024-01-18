package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class quiz3 : AppCompatActivity() {
    private lateinit var jawaban31 : ImageView
    private lateinit var jawaban32 : ImageView
    private lateinit var jawaban33 : ImageView
    private lateinit var jawaban34 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz3)
        jawaban31 = findViewById(R.id.jawaban31)
        jawaban32 = findViewById(R.id.jawaban32)
        jawaban33 = findViewById(R.id.jawaban33)
        jawaban34 = findViewById(R.id.jawaban34)

        jawaban31.setOnClickListener {
            startActivity(Intent(this, wrong3::class.java))
        }
        jawaban32.setOnClickListener {
            startActivity(Intent(this, wrong3::class.java))
        }
        jawaban33.setOnClickListener {
            startActivity(Intent(this, wrong3::class.java))
        }
        jawaban34.setOnClickListener {
            startActivity(Intent(this, correct3::class.java))
        }
    }
}