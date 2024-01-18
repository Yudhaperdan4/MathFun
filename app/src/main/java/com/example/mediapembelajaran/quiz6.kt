package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class quiz6 : AppCompatActivity() {
    private lateinit var jawaban61 : ImageView
    private lateinit var jawaban62 : ImageView
    private lateinit var jawaban63 : ImageView
    private lateinit var jawaban64 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz6)
        jawaban61 = findViewById(R.id.jawaban61)
        jawaban62 = findViewById(R.id.jawaban62)
        jawaban63 = findViewById(R.id.jawaban63)
        jawaban64 = findViewById(R.id.jawaban64)

        jawaban61.setOnClickListener {
            startActivity(Intent(this, wrong6::class.java))
        }
        jawaban62.setOnClickListener {
            startActivity(Intent(this, wrong6::class.java))
        }
        jawaban63.setOnClickListener {
            startActivity(Intent(this, wrong6::class.java))
        }
        jawaban64.setOnClickListener {
            startActivity(Intent(this, correct6::class.java))
        }
    }
}