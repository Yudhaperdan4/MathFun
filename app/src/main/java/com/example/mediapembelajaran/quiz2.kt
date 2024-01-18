package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class quiz2 : AppCompatActivity() {
    private lateinit var jawaban21 : ImageView
    private lateinit var jawaban22 : ImageView
    private lateinit var jawaban23 : ImageView
    private lateinit var jawaban24 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz2)
        jawaban21 = findViewById(R.id.jawaban21)
        jawaban22 = findViewById(R.id.jawaban22)
        jawaban23 = findViewById(R.id.jawaban23)
        jawaban24 = findViewById(R.id.jawaban24)

        jawaban21.setOnClickListener {
            startActivity(Intent(this, correct2::class.java))
        }
        jawaban22.setOnClickListener {
            startActivity(Intent(this, wrong2::class.java))
        }
        jawaban23.setOnClickListener {
            startActivity(Intent(this, wrong2::class.java))
        }
        jawaban24.setOnClickListener {
            startActivity(Intent(this, wrong2::class.java))
        }
    }
}